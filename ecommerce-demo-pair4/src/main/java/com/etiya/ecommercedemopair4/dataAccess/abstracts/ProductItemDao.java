package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemDao extends JpaRepository<ProductItem, Integer> {
}
