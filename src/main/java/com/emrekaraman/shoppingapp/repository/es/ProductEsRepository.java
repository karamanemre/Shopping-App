package com.emrekaraman.shoppingapp.repository.es;

import com.emrekaraman.shoppingapp.product.entity.es.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs, String> {
}
