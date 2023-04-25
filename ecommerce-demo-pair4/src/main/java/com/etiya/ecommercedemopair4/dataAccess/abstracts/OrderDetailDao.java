package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Invoice;
import com.etiya.ecommercedemopair4.entities.concrete.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer> {
    @Query("SELECT od FROM OrderDetail od")
    List<OrderDetail> findAllByOrderDetail();

    @Query("SELECT p, o FROM OrderDetail od JOIN od.productItem p JOIN od.order o")
    List<OrderDetail>getAllByOrderDetail();
}
