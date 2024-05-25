package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateViajeCommand;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateViajeResource;

public class CreateViajeCommandFromResourceAssembler {
    public static CreateViajeCommand toCommandFromResource(CreateViajeResource resource) {
        return new CreateViajeCommand(
                resource.title(),
                resource.description(),
                resource.photoUrl(),
                resource.rating()
        );
    }
}
