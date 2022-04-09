package com.emrekaraman.shoppingapp.product.repository.mongo;

import com.emrekaraman.shoppingapp.product.entity.Product;
import com.emrekaraman.shoppingapp.product.entity.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice,String> {

}
