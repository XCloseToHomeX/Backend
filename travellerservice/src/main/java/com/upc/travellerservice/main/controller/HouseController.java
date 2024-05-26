package com.upc.travellerservice.main.controller;

import com.upc.travellerservice.main.domain.dto.HouseRequest;
import com.upc.travellerservice.main.domain.dto.HouseResponse;
import com.upc.travellerservice.main.domain.services.HouseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/houses")
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addHouse(@RequestBody HouseRequest dtoHouse) {
        this.houseService.addHouse(dtoHouse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HouseResponse> getAllHouses() {
        return this.houseService.getAllHouses();
    }
}
