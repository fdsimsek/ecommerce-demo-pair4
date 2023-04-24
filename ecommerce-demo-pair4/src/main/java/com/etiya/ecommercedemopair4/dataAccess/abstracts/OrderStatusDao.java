package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusDao extends JpaRepository<OrderStatus, Integer> {
}
