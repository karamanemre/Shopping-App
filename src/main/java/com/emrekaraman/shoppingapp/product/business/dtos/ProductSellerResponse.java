package com.emrekaraman.shoppingapp.product.business.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductSellerResponse {
    private String id;
    private String name;
}
