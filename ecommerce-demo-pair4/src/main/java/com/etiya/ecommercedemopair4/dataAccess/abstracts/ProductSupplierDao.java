package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductSupplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSupplierDao extends JpaRepository<ProductSupplier, Integer> {
}
