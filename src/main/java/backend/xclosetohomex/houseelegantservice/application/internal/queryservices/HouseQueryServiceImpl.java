package backend.xclosetohomex.houseelegantservice.application.internal.queryservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.House;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllHousesQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetHouseByIdQuery;
import backend.xclosetohomex.houseelegantservice.domain.service.HouseQueryService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.HouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseQueryServiceImpl implements HouseQueryService {
    private final HouseRepository houseRepository;

    public HouseQueryServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Optional<House> handle(GetHouseByIdQuery query) {
        return houseRepository.findById(query.houseId());
    }

    @Override
    public List<House> handle(GetAllHousesQuery query) {
        return houseRepository.findAll();
    }
}
