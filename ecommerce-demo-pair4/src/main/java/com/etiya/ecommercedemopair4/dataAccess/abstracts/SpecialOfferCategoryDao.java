package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.SpecialOfferCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialOfferCategoryDao extends JpaRepository<SpecialOfferCategory, Integer> {
}
