package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repo.CutomerRepo;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("customer")
public class CustomerController<MasterCrudApllication> {
	
	@Autowired
	CustomerService customerService;
	

	@Autowired
	CutomerRepo	cutomerrepo;
	
	@PostMapping("/addcust")
	public void saveStudents(@RequestBody CustomerEntity customerEntity) {
		 customerService.save(customerEntity);
	}
	
	@GetMapping("/getcust/{id}")
	public List<CustomerEntity > getStudents() {
		return customerService.listAll();
	}
	
	@DeleteMapping("/deletecust/{id}")
	public String deleteCustomerEntityById(@PathVariable("id")long id) {
		
		cutomerrepo.deleteById(id);
		return "Customer deleted successfully";
		}
		//return CustomerEntity.notFound().build();
	}
	
	
	
	
	
//	@PostMapping("/save")
//	public CustomerEntity saveCustomer(@RequestBody CustomerEntity customerEntity) {
//	
//		CustomerEntity customerSave = customerService.saveCustomer(customerEntity);
//		
//		return customerSave;
//		
//	}
//	@PutMapping("/update")
//	public CustomerEntity updateCustomer(@RequestBody CustomerEntity customerEntity) {
//		
//	CustomerEntity customerUpdate = customerService.updateCustomer(customerEntity);
//		
//		return customerUpdate;
//	}
////	@GetMapping("{id}")
////    public MasterCrudApllication getCustomerById(@PathVariable Long id, Object MasterCrudApllication) {
////		 MasterCrudApllication = customerService.getByaId(id);
////        return (MasterCrudApllication) customerService.getCustomerById(id);
////        
////
////
////}
//}
//
