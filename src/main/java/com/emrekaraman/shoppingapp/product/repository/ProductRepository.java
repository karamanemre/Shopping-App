package com.emrekaraman.shoppingapp.product.repository;

import com.emrekaraman.shoppingapp.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {



}
