package com.dao;

import com.models.BakeryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BakeryRepository extends JpaRepository<BakeryEntity, Long> {

    @Query(value = "SELECT MAX(price) from bakery",
            nativeQuery = true)
    double getMaxBakePrice();

}
