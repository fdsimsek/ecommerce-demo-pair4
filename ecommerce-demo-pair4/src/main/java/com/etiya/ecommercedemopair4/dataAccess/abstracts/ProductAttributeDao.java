package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAttributeDao extends JpaRepository<ProductAttribute, Integer> {
}
