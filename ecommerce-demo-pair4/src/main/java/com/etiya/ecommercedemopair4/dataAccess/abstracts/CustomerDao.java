package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Customer;
import com.etiya.ecommercedemopair4.entities.concrete.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
    @Query("SELECT c FROM Customer c")
    List<Customer> findAllByCustomer();

}
