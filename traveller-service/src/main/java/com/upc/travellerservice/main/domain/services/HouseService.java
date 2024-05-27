package com.upc.travellerservice.main.domain.services;

import com.upc.travellerservice.main.domain.dto.HouseRequest;
import com.upc.travellerservice.main.domain.dto.HouseResponse;
import com.upc.travellerservice.main.domain.entities.House;
import com.upc.travellerservice.main.persistance.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class HouseService {
    private final HouseRepository houseRepository;
    public void addHouse(HouseRequest _house) {
        var house = new House();
        house.setCountry(_house.getCountry());
        house.setCity(_house.getCity());
        house.setStreetAddress(_house.getStreetAddress());
        house.setPrice(_house.getPrice());
        house.setCapacity(_house.getCapacity());
        house.setRating(_house.getRating());
        house.setPhotoUrl(_house.getPhotoUrl());
        houseRepository.save(house);
    }
    public List<HouseResponse> getAllHouses() {
        var houses = houseRepository.findAll();
        return houses.stream().map(this::mapHouseToResponseHouse).toList();
    }

    private HouseResponse mapHouseToResponseHouse(House _house) {
        return HouseResponse.builder()
                .id(_house.getId())
                .country(_house.getCountry())
                .city(_house.getCity())
                .streetAddress(_house.getStreetAddress())
                .price(_house.getPrice())
                .capacity(_house.getCapacity())
                .rating(_house.getRating())
                .photoUrl(_house.getPhotoUrl()).build();
    }
}
