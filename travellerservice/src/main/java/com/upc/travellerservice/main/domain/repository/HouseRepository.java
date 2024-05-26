package com.upc.travellerservice.main.domain.repository;

import com.upc.travellerservice.main.domain.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}