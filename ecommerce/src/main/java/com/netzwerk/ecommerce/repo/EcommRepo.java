package com.netzwerk.ecommerce.repo;

import com.netzwerk.ecommerce.dto.EcommDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EcommRepo extends JpaRepository<EcommDTO,Integer> {
    List<EcommDTO> findByModel(String model);
}
