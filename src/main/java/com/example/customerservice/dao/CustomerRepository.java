package com.example.customerservice.dao;

import com.example.customerservice.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel,Integer> {
}