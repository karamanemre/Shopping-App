package com.emrekaraman.shoppingapp.product.business.abstracts;

import com.emrekaraman.shoppingapp.product.entity.MoneyTypes;

import java.math.BigDecimal;

public interface ProductPriceService {

    BigDecimal getByMoneyType(String id, MoneyTypes moneyTypes);
}
