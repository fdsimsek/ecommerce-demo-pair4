package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Colour;
import com.etiya.ecommercedemopair4.entities.concrete.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryDao extends JpaRepository<Country, Integer> {

    @Query("SELECT c FROM Country c")
    List<Country> findAllByCountry();
}
