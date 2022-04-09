package com.emrekaraman.shoppingapp.product.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "product_price")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductPrice implements Serializable {
    private String id;
    private String productId;
    private MoneyTypes moneyType;
    private String price;
}
