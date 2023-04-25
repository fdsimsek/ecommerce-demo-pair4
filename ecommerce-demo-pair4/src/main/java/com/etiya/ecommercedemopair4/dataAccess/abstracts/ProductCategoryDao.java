package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductAttribute;
import com.etiya.ecommercedemopair4.entities.concrete.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
    @Query("SELECT pc FROM ProductCategory pc")
    List<ProductCategory> findAllByProductCategory();

    @Query("SELECT p, c FROM ProductCategory pc JOIN pc.product p JOIN pc.category c")
    List<ProductCategory>getAllByProductCategory();
}
