package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ProductCategory;
import com.etiya.ecommercedemopair4.entities.concrete.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductItemDao extends JpaRepository<ProductItem, Integer> {
    @Query("SELECT pi FROM ProductItem pi")
    List<ProductItem> findAllByProductItem();

    @Query("SELECT p FROM ProductItem pi JOIN pi.product p")
    List<ProductItem>getAllByProductItem();
}
