package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerEntity;

@Repository
public interface CutomerRepo extends JpaRepository<CustomerEntity, Long> {

	

 
}
