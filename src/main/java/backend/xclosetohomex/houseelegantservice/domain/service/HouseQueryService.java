package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.House;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllHousesQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetHouseByIdQuery;

import java.util.List;
import java.util.Optional;

public interface HouseQueryService {
    Optional<House> handle(GetHouseByIdQuery query);
    List<House> handle(GetAllHousesQuery query);
}
