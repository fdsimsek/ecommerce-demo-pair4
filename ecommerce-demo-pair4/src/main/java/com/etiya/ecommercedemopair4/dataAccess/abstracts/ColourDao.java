package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Category;
import com.etiya.ecommercedemopair4.entities.concrete.Colour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ColourDao extends JpaRepository<Colour, Integer> {

    @Query("SELECT c FROM Colour c")
    List<Colour> findAllByColour();

}
