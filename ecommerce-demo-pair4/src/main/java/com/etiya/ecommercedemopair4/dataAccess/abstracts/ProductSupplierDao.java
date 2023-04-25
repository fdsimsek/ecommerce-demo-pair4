package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductItem;
import com.etiya.ecommercedemopair4.entities.concrete.ProductSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductSupplierDao extends JpaRepository<ProductSupplier, Integer> {
    @Query("SELECT ps FROM ProductSupplier ps")
    List<ProductSupplier> findAllByProductSupplier();

    @Query("SELECT p, s.contactName FROM ProductSupplier ps JOIN ps.product p JOIN ps.supplier s")
    List<ProductSupplier>getAllBProductSupplier();
}
