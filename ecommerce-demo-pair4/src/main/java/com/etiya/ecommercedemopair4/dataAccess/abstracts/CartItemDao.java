package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Cart;
import com.etiya.ecommercedemopair4.entities.concrete.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartItemDao extends JpaRepository<CartItem, Integer> {
    @Query("SELECT ci FROM CartItem ci")
    List<CartItem> findAllByCartItem();

    @Query("SELECT pi.unitPrice, c.discountKey, p.name, cu.contactName FROM " +
            "CartItem ci JOIN ci.cart c JOIN ci.productItem pi JOIN c.customer cu JOIN pi.product p")
    List<CartItem>getAllByCartItem();
}

