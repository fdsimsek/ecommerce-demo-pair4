package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
