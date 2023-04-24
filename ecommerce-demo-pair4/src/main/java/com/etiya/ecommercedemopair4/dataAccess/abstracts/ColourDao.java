package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Colour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColourDao extends JpaRepository<Colour, Integer> {
}
