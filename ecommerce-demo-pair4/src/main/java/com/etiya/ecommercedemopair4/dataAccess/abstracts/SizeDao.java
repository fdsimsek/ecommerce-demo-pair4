package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.Refund;
import com.etiya.ecommercedemopair4.entities.concrete.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SizeDao extends JpaRepository<Size, Integer> {
    @Query("SELECT s FROM Size s")
    List<Size> findAllBySize();
}
