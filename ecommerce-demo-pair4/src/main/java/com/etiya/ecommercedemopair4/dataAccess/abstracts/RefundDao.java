package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundDao extends JpaRepository<Refund, Integer> {
}
