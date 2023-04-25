package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductItem;
import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RefundDao extends JpaRepository<Refund, Integer> {
    @Query("SELECT r FROM Refund r")
    List<Refund> findAllByRefund();

    @Query("SELECT i.id, od.quantity, od.totalPrice FROM Refund r JOIN r.invoice i JOIN i.orderDetail od")
    List<Refund>getAllByRefund();
}
