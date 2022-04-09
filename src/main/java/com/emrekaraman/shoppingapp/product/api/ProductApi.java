package com.emrekaraman.shoppingapp.product.api;

import com.emrekaraman.shoppingapp.product.business.abstracts.ProductService;
import com.emrekaraman.shoppingapp.product.business.dtos.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/productapi")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @GetMapping("getAllProducts")
    public ResponseEntity<Flux<ProductResponseDto>> getAllProducts(){
        return ResponseEntity.ok(productService.getAll());
    }
}
