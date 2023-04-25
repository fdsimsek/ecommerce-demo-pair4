package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import com.etiya.ecommercedemopair4.entities.concrete.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SupplierDao extends JpaRepository<Supplier, Integer> {
    @Query("SELECT s FROM Supplier s")
    List<Supplier> findAllBySupplier();

}
