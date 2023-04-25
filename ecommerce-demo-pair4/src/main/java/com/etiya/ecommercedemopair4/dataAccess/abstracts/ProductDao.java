package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Product;
import com.etiya.ecommercedemopair4.entities.concrete.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p")
    List<Product> findAllByProduct();

    @Query("SELECT p.name, ca.categoryName, si.size, co.colourName, s.companyName  FROM " +
            "Product p JOIN p.productAttribute pa JOIN p.productCategory pc JOIN p.supplier s JOIN " +
            "pa.size si JOIN pa.colour co JOIN pc.category ca")
    List<Product>getAllByProduct();
}
