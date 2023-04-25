package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.CustomerAddress;
import com.etiya.ecommercedemopair4.entities.concrete.CustomerReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerReviewDao extends JpaRepository<CustomerReview, Integer> {
    @Query("SELECT cr FROM CustomerReview cr")
    List<CustomerReview> findAllByCustomerReview();

    @Query("SELECT cr, cu, od FROM CustomerReview cr JOIN cr.customer cu JOIN cr.orderDetail od")
    List<CustomerReview>getAllByCustomerReview();
}
