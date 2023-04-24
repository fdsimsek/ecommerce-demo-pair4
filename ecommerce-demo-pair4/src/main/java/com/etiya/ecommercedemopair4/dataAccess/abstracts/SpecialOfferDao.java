package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.SpecialOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialOfferDao extends JpaRepository<SpecialOffer, Integer> {
}
