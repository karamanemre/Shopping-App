package com.emrekaraman.shoppingapp.product.business.concretes;

import com.emrekaraman.shoppingapp.product.business.abstracts.*;
import com.emrekaraman.shoppingapp.product.business.dtos.ProductResponseDto;
import com.emrekaraman.shoppingapp.product.business.dtos.ProductSellerResponse;
import com.emrekaraman.shoppingapp.product.entity.MoneyTypes;
import com.emrekaraman.shoppingapp.product.entity.es.ProductEs;
import com.emrekaraman.shoppingapp.product.repository.mongo.ProductRepository;
import com.emrekaraman.shoppingapp.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;
    private final ProductDeliveryService productDeliveryService;
    private final ProductAmountService productAmountService;
    private final ProductImageService productImageService;

    @Override
    public Flux<ProductResponseDto> getAll() {
        productEsRepository.findAll().map(this::mapToDto);
        return null;
    }

    public ProductResponseDto mapToDto(ProductEs item) {
        BigDecimal productPrice = productPriceService.getByMoneyType(item.getId(), MoneyTypes.USD);
        return ProductResponseDto.builder()
                .price(productPrice)
                .name(item.getName())
                .features(item.getFeatures())
                .id(item.getId())
                .description(item.getDescription())
                .deliveryIn(productDeliveryService.getDeliveryInfo(item.getId()))
                .categoryId(item.getCategory().getId())
                .available(productAmountService.getByProductId(item.getId()))
                .freeDelivery(productDeliveryService.isFreeDeliveryCheck(item.getId(),productPrice))
                .moneyType(MoneyTypes.USD)
                .image(productImageService.getProductMainImage(item.getId()))
                .seller(ProductSellerResponse.builder().id(item.getSeller().getId()).name(item.getSeller().getName()).build())
                .build();
    }
}
