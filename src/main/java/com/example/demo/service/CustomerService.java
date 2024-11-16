package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.MatserCrudApplication;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.repo.CutomerRepo;

@Service
public class CustomerService {
	
	
	@Autowired
	
	CutomerRepo cutomerRepo;

//	public CustomerEntity saveCustomer(CustomerEntity customerEntity) {
//		
//		CustomerEntity customer =cutomerRepo.save(customerEntity);
//		return customer;
//	}
//  
//	public CustomerEntity getCustomerById(long id) {
//	    return cutomerRepo.findById(id)
//	               .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id)); // Option 2: Throw exception if not found
//	}

//	public CustomerEntity getByaId(Long id) {
//		Optional<CustomerEntity> CustomerEntity =cutomerRepo.findById(id );
//		return CustomerEntity.get();
//	}
//
//	public CustomerEntity updateCustomer(CustomerEntity customerEntity) {
//	     
//		CustomerEntity customer =cutomerRepo.save(customerEntity);
//		return customer;	}

	public void save(CustomerEntity customerEntity) {
		cutomerRepo.save(customerEntity);
	}
	public List<CustomerEntity> listAll() {
		return cutomerRepo.findAll();
	}
	

		
		public void delete(CustomerEntity customerEntity) {
			this.cutomerRepo.delete(customerEntity);
			
		}

		
	}
	

	

	

