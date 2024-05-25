package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.House;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.HouseResource;

public class HouseResourceFromEntityAssembler {
    public static HouseResource toResourceFromEntity(House house){
        return new HouseResource(house.getId(), house.getCountry(), house.getCity(), house.getStreetAddress(),
                house.getPrice(), house.getCapacity(), house.getRating(), house.getPhotoUrl());
    }
}
