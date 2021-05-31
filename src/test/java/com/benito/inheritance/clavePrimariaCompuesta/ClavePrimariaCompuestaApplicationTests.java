package com.benito.inheritance.clavePrimariaCompuesta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.benito.inheritance.clavePrimariaCompuesta.entities.embebedable.CustomerId;
import com.benito.inheritance.clavePrimariaCompuesta.repos.CustomerRepo;

@SpringBootTest
class ClavePrimariaCompuestaApplicationTests {

	
	@Autowired
	private CustomerRepo repo2;
	
	@Test
	void testSaveCustomer() {
		
//		Customer customer = new Customer();
//		customer.setId(123);
//		customer.setEmail("test@test.com");
//		customer.setName("Ruben");
//		repo.save(customer);
	}
	
	@Test
	void testSaveCustomerEmbedded() {
		com.benito.inheritance.clavePrimariaCompuesta.entities.embebedable.Customer customer = 
				new com.benito.inheritance.clavePrimariaCompuesta.entities.embebedable.Customer();
		CustomerId customerId = new CustomerId();
		customerId.setId(124);
		customerId.setEmail("test@test.com");
		customer.setId(customerId);
		customer.setName("Benito");
		repo2.save(customer);
	}

}
