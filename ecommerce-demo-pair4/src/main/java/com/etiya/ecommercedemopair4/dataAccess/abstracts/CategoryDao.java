package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Cart;
import com.etiya.ecommercedemopair4.entities.concrete.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {

    @Query("SELECT c FROM Category c")
    List<Category> findAllByCategory();

    @Query("SELECT c.categoryName, pc.name  FROM Category c JOIN c.parentCategory pc")
    List<Category>getAllByCategory();

}
