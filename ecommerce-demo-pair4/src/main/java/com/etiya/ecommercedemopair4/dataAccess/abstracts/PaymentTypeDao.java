package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeDao extends JpaRepository<PaymentType, Integer> {
}
