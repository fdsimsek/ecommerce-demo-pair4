package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeDao extends JpaRepository<Size, Integer> {
}