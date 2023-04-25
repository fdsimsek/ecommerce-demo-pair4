package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import com.etiya.ecommercedemopair4.entities.concrete.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShippingMethodDao extends JpaRepository<ShippingMethod, Integer> {
    @Query("SELECT sm FROM ShippingMethod sm")
    List<ShippingMethod> findAllByShippingMethod();
}
