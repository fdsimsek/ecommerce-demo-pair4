package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import com.etiya.ecommercedemopair4.entities.concrete.SupplierResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SupplierResponseDao extends JpaRepository<SupplierResponse, Integer> {
    @Query("SELECT sr FROM SupplierResponse sr")
    List<SupplierResponse> findAllBySupplierResponse();

    @Query("SELECT s.companyName, cr.comment, cr.ratingValue FROM " +
            "SupplierResponse sr JOIN sr.supplier s JOIN sr.customerReview cr")
    List<SupplierResponse>getAllBySupplierResponse();
}
