package com.benito.inheritance.clavePrimariaCompuesta.repos;

import org.springframework.data.repository.CrudRepository;

import com.benito.inheritance.clavePrimariaCompuesta.entities.embebedable.Customer;
import com.benito.inheritance.clavePrimariaCompuesta.entities.embebedable.CustomerId;

public interface CustomerRepo extends CrudRepository<Customer, CustomerId> {

}
