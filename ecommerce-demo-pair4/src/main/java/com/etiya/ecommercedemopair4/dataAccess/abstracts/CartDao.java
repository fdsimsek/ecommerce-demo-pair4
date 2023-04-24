package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.etiya.ecommercedemopair4.entities.concrete.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {
}
