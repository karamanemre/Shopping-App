package com.emrekaraman.shoppingapp.product.business.concretes;

import com.emrekaraman.shoppingapp.product.business.abstracts.ProductPriceService;
import com.emrekaraman.shoppingapp.product.entity.MoneyTypes;
import com.emrekaraman.shoppingapp.product.repository.mongo.ProductPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductPriceManager implements ProductPriceService {

    private final ProductPriceRepository productPriceRepository;

    @Override
    public BigDecimal getByMoneyType(String id, MoneyTypes moneyTypes){
        return BigDecimal.TEN;
    }
}
