package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import com.etiya.ecommercedemopair4.entities.concrete.Cart;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartDao extends JpaRepository<Cart, Integer> {
    @Query("SELECT c FROM Cart c")
    List<Cart> findAllByCart();

    @Query("SELECT c.id, cu.contactName, cu.companyName FROM Cart c JOIN c.customer cu")
    List<Cart>getAllByCart();
}
