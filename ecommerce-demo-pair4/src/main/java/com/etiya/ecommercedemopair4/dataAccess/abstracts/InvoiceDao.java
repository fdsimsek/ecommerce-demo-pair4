package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.CustomerReview;
import com.etiya.ecommercedemopair4.entities.concrete.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InvoiceDao extends JpaRepository<Invoice,Integer> {
    @Query("SELECT i FROM Invoice i")
    List<Invoice> findAllByInvoice();

    @Query("SELECT i, od, o FROM Invoice i JOIN i.orderDetail od JOIN od.order o")
    List<Invoice>getAllByInvoice();
}
