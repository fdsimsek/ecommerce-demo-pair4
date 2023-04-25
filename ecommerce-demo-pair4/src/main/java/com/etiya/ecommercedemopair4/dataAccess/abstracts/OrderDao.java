package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Address;
import com.etiya.ecommercedemopair4.entities.concrete.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDao extends JpaRepository<Order, Integer> {

    @Query("SELECT o FROM Order o")
    List<Order> findAllByOrder();

    @Query("SELECT o.orderDate, o.orderTotal, c.companyName, os.status, sm.name, sm.shippingPrice FROM " +
            "Order o JOIN o.customer c JOIN o.orderStatus os JOIN o.shippingMethod sm")
    List<Order>getAllByOrder();
}
