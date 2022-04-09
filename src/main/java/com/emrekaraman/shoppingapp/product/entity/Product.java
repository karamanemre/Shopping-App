package com.emrekaraman.shoppingapp.product.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Document(collection = "product")
@Data
@EqualsAndHashCode(of = "id")
public class Product implements Serializable {

    private String id;
    private String name;
    private String code;
    private String description;
    private String sellerId;
    private String features;
    private String categoryId;
    private List<ProductImage> productImage;
    private Boolean active;
}
