package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateMensajeriaTravellerCommand;

public interface MensajeriaTravellerCommandService {
    Long handle(CreateMensajeriaTravellerCommand command);

}
