package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import com.etiya.ecommercedemopair4.entities.concrete.SpecialOfferCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpecialOfferCategoryDao extends JpaRepository<SpecialOfferCategory, Integer> {
    @Query("SELECT soc FROM SpecialOfferCategory soc")
    List<SpecialOfferCategory> findAllBySpecialOfferCategory();

    @Query("SELECT c.categoryName, so.description, so.discountRate  FROM" +
            " SpecialOfferCategory soc JOIN soc.category c JOIN soc.specialOffer so")
    List<SpecialOfferCategory>getAllBySpecialOfferCategory();
}
