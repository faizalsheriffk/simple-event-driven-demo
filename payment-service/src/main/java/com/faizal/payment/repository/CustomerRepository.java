package com.faizal.payment.repository;

import org.springframework.data.repository.CrudRepository;

import com.faizal.payment.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
