package com.emrekaraman.shoppingapp.product.business.abstracts;

import com.emrekaraman.shoppingapp.product.business.dtos.ProductResponseDto;
import com.emrekaraman.shoppingapp.product.entity.Product;
import reactor.core.publisher.Flux;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductService {

    Flux<ProductResponseDto> getAll();
}
