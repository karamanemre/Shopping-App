package com.emrekaraman.shoppingapp.product.repository.mongo;

import com.emrekaraman.shoppingapp.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {



}
