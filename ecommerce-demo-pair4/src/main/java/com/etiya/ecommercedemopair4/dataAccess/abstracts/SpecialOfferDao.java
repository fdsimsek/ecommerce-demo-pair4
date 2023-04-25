package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import com.etiya.ecommercedemopair4.entities.concrete.SpecialOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpecialOfferDao extends JpaRepository<SpecialOffer, Integer> {
    @Query("SELECT so FROM SpecialOffer so")
    List<SpecialOffer> findAllBySpecialOffer();
}
