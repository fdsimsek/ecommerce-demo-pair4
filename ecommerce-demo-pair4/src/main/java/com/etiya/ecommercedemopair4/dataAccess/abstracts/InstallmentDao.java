package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Installment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstallmentDao extends JpaRepository<Installment, Integer> {
}
