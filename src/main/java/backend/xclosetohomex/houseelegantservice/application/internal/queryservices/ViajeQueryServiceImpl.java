package backend.xclosetohomex.houseelegantservice.application.internal.queryservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Viaje;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetViajeAllQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetViajeByIdQuery;
import backend.xclosetohomex.houseelegantservice.domain.service.ViajeQueryService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.ViajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViajeQueryServiceImpl implements ViajeQueryService {
    private final ViajeRepository viajeRepository;

    public ViajeQueryServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public Optional<Viaje> handle(GetViajeByIdQuery query) {
        return viajeRepository.findById(query.viajeId());
    }

    @Override
    public List<Viaje> handle(GetViajeAllQuery query) {
        return viajeRepository.findAll();
    }
}
