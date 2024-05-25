package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateViajeCommand;

public interface ViajeCommandService {
    Long handle(CreateViajeCommand command);
}
