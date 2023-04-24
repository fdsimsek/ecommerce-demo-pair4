package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingMethodDao extends JpaRepository<ShippingMethod, Integer> {
}
