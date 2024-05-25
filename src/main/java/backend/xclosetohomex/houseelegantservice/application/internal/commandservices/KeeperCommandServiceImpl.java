package backend.xclosetohomex.houseelegantservice.application.internal.commandservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Keeper;
import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateKeeperCommand;
import backend.xclosetohomex.houseelegantservice.domain.service.KeeperCommandService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRepository;
import org.springframework.stereotype.Service;

@Service
public class KeeperCommandServiceImpl implements KeeperCommandService {
    private final KeeperRepository keeperRepository;

    public KeeperCommandServiceImpl(KeeperRepository keeperRepository) {
        this.keeperRepository = keeperRepository;
    }

    @Override
    public Long handle(CreateKeeperCommand command) {
        var keeper = new Keeper(command.name(), command.country(), command.city(), command.streetAddress(),
                command.description(), command.photoUrl(), command.rating());
        keeperRepository.save(keeper);
        return keeper.getId();
    }
}
