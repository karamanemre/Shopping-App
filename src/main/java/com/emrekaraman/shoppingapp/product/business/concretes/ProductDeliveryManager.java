package com.emrekaraman.shoppingapp.product.business.concretes;

import com.emrekaraman.shoppingapp.product.business.abstracts.ProductDeliveryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductDeliveryManager implements ProductDeliveryService {
    @Override
    public String getDeliveryInfo(String productId){
        return "Tomorrow";
    }

    @Override
    public boolean isFreeDeliveryCheck(String productId, BigDecimal price) {
        return price.compareTo(BigDecimal.ONE) >= 0;
    }
}
