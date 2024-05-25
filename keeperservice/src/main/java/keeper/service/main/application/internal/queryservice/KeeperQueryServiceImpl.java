package keeper.service.main.application.internal.queryservice;

import keeper.service.main.domain.model.entities.Keeper;
import keeper.service.main.domain.model.query.GetAllKeepersQuery;
import keeper.service.main.domain.model.query.GetKeeperByIdQuery;
import keeper.service.main.domain.service.KeeperQueryService;
import keeper.service.main.infrastructure.persistence.jpa.repository.KeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KeeperQueryServiceImpl implements KeeperQueryService {

    @Autowired
    KeeperRepository keeperRepository;

    @Override
    public List<Keeper> handle(GetAllKeepersQuery query) {
        return keeperRepository.findAll();
    }

    @Override
    public Optional<Keeper> handle(GetKeeperByIdQuery query) {
        return keeperRepository.findById(query.id());
    }
}
