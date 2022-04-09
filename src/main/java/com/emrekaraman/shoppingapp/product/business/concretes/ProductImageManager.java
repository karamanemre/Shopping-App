package com.emrekaraman.shoppingapp.product.business.concretes;

import com.emrekaraman.shoppingapp.product.business.abstracts.ProductImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductImageManager implements ProductImageService {

    @Override
    public String getProductMainImage(String productId){
        return "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-13-pro-family-hero?wid=940&hei=1112&fmt=png-alpha&.v=1644969385433";
    }
}
