package com.emrekaraman.shoppingapp.product.entity.es;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Data
@EqualsAndHashCode(of = "id")
public class ProductEs {
    private String id;
    private String name;
    private String code;
    private String description;
    private String features;
    private SellerEs seller;
    private CategoryEs category;
    private Boolean active;
}
