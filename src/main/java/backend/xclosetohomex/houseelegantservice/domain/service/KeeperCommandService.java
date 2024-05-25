package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateKeeperCommand;

public interface KeeperCommandService {
    Long handle(CreateKeeperCommand command);
}
