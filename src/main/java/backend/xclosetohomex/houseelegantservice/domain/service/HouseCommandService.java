package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateHouseCommand;

public interface HouseCommandService {
    Long handle(CreateHouseCommand command);
}
