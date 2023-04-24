package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemDao extends JpaRepository<CartItem, Integer> {
}
