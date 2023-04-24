package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.CustomerReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReviewDao extends JpaRepository<CustomerReview, Integer> {
}
