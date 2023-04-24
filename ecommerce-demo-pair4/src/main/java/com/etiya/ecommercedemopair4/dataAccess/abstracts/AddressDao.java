package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address,Integer> {

}
