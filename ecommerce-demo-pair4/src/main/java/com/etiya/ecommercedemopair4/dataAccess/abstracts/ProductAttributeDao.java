package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.PaymentMethod;
import com.etiya.ecommercedemopair4.entities.concrete.ProductAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductAttributeDao extends JpaRepository<ProductAttribute, Integer> {
    @Query("SELECT pa FROM ProductAttribute pa")
    List<ProductAttribute> findAllByProductAttribute();

    @Query("SELECT c, s FROM ProductAttribute pa JOIN pa.colour c JOIN pa.size s")
    List<ProductAttribute>getAllByProductAttribute();
}
