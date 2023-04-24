package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Integer> {
}
