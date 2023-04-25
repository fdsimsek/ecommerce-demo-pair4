package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.OrderDetail;
import com.etiya.ecommercedemopair4.entities.concrete.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderStatusDao extends JpaRepository<OrderStatus, Integer> {
    @Query("SELECT os FROM OrderStatus os")
    List<OrderStatus> findAllByOrderStatus();
}
