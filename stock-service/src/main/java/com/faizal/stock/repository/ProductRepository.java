package com.faizal.stock.repository;

import org.springframework.data.repository.CrudRepository;

import com.faizal.stock.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
