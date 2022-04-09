package com.emrekaraman.shoppingapp.product.business.concretes;

import com.emrekaraman.shoppingapp.product.business.abstracts.ProductAmountService;
import org.springframework.stereotype.Service;

@Service
public class ProductAmountManager implements ProductAmountService {
    @Override
    public int getByProductId(String id) {
        return 10;
    }
}
