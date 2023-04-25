package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.OrderDetail;
import com.etiya.ecommercedemopair4.entities.concrete.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentMethodDao extends JpaRepository<PaymentMethod, Integer> {
    @Query("SELECT pm FROM PaymentMethod pm")
    List<PaymentMethod> findAllByPaymentMethod();

    @Query("SELECT c, pt FROM PaymentMethod pm JOIN pm.customer c JOIN pm.paymentType pt")
    List<PaymentMethod>getAllByPaymentMethod();
}
