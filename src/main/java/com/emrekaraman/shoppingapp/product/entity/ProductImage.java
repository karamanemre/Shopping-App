package com.emrekaraman.shoppingapp.product.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_image")
@Data
public class ProductImage {

    private ImageType imageType;
    private String url;

    public enum ImageType{
        FEATURE,NORMAL;
    }
}
