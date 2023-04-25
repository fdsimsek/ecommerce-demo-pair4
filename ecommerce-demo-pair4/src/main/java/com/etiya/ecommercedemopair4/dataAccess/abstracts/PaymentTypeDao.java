package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.PaymentMethod;
import com.etiya.ecommercedemopair4.entities.concrete.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentTypeDao extends JpaRepository<PaymentType, Integer> {
    @Query("SELECT pt FROM PaymentType pt")
    List<PaymentType> findAllByPaymentType();
}
