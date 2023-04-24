package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.ParentCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentCategoryDao extends JpaRepository<ParentCategory, Integer> {
}
