package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.OrderDetail;
import com.etiya.ecommercedemopair4.entities.concrete.ParentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParentCategoryDao extends JpaRepository<ParentCategory, Integer> {
    @Query("SELECT p FROM ParentCategory p")
    List<ParentCategory> findAllByParentCategory();
}
