package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateKeeperRequestCommand;

public interface KeeperRequestCommandService {
    Long handle(CreateKeeperRequestCommand command);

}