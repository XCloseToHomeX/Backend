package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateMensajeriaCommand;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateMensajeriaResource;

public class CreateMensajeriaCommandFromResourceAssembler {
    public static CreateMensajeriaCommand toCommandFromResource(CreateMensajeriaResource resource) {
        return new CreateMensajeriaCommand(
                resource.nombre(),
                resource.description(),
                resource.photoFace()
        );
    }
}