package backend.xclosetohomex.houseelegantservice.application.internal.queryservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Keeper;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllKeepersQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetKeeperByIdQuery;
import backend.xclosetohomex.houseelegantservice.domain.service.KeeperQueryService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KeeperQueryServiceImpl implements KeeperQueryService {
    private final KeeperRepository keeperRepository;

    public KeeperQueryServiceImpl(KeeperRepository keeperRepository) {
        this.keeperRepository = keeperRepository;
    }

    @Override
    public Optional<Keeper> handle(GetKeeperByIdQuery query) {
        return keeperRepository.findById(query.keeperId());
    }

    @Override
    public List<Keeper> handle(GetAllKeepersQuery query) {
        return keeperRepository.findAll();
    }
}
