package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodDao extends JpaRepository<PaymentMethod, Integer> {
}
