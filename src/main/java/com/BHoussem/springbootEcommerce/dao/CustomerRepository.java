package com.BHoussem.springbootEcommerce.dao;

import com.BHoussem.springbootEcommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);
}
