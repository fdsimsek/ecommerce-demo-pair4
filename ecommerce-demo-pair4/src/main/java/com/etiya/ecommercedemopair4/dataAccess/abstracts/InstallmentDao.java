package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.CustomerReview;
import com.etiya.ecommercedemopair4.entities.concrete.Installment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InstallmentDao extends JpaRepository<Installment, Integer> {

    @Query("SELECT i FROM Installment i")
    List<Installment> findAllByInstallment();

}
