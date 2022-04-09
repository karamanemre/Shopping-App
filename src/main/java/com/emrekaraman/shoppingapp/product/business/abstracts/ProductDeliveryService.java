package com.emrekaraman.shoppingapp.product.business.abstracts;

import java.math.BigDecimal;

public interface ProductDeliveryService {

    public String getDeliveryInfo(String productId);
    public boolean isFreeDeliveryCheck(String productId, BigDecimal price);
}
