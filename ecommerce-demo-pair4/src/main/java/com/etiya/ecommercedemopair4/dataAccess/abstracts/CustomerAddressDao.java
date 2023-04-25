package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Address;
import com.etiya.ecommercedemopair4.entities.concrete.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerAddressDao extends JpaRepository<CustomerAddress, Integer> {
    @Query("SELECT ca.id FROM CustomerAddress ca")
    List<CustomerAddress> findAllByCustomerAddress();

    @Query("SELECT ca.id, ca.address, ca.customer, c.companyName, a.address FROM" +
            " CustomerAddress ca JOIN ca.customer c JOIN ca.address a")
    List<CustomerAddress>getCustomerAddressesByCustomersAndAddresses();
}
