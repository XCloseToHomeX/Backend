package backend.xclosetohomex.houseelegantservice.application.internal.commandservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateKeeperRequestCommand;
import backend.xclosetohomex.houseelegantservice.domain.service.KeeperRequestCommandService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.KeeperRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class KeeperRequestCommandServiceImpl  implements KeeperRequestCommandService {
    private final KeeperRequestRepository keeperRequestRepository;

    public KeeperRequestCommandServiceImpl(KeeperRequestRepository keeperRequestRepository) {
        this.keeperRequestRepository = keeperRequestRepository;
    }


    @Override
    public Long handle(CreateKeeperRequestCommand command) {
        var keeperRequest = new KeeperRequest(command.name(), command.message(), command.photoUrl(),
                command.rating());
        keeperRequestRepository.save(keeperRequest);
        return keeperRequest.getId();
    }
}