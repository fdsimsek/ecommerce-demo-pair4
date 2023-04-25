package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressDao extends JpaRepository<Address,Integer> {
    @Query("SELECT a FROM Address a")
    List<Address>findAllByAddress();

    @Query("SELECT a.city,c.countryName FROM Address a JOIN a.country c")
    List<Address>getAddressByCountry();

}
