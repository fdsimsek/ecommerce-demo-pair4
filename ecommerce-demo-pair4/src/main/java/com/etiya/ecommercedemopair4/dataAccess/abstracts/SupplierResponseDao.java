package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.SupplierResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierResponseDao extends JpaRepository<SupplierResponse, Integer> {
}
