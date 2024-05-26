package com.upc.travellerservice.main.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HouseResponse {
    private Long id;
    private String country;
    private String city;
    private String streetAddress;
    private String price;
    private String capacity;
    private String rating;
    private String photoUrl;
}

