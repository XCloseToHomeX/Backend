package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateMensajeriaCommand;

public interface MensajeriaCommandService {
    Long handle(CreateMensajeriaCommand command);

}
