package com.emrekaraman.shoppingapp.product.business.dtos;

import com.emrekaraman.shoppingapp.product.entity.MoneyTypes;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponseDto {
    private String id;
    private String image;
    private String name;
    private String description;
    private ProductSellerResponse seller;
    private String features;
    private int available;
    private boolean freeDelivery;
    private String deliveryIn;
    private BigDecimal price;
    private String categoryId;
    private MoneyTypes moneyType;
}
