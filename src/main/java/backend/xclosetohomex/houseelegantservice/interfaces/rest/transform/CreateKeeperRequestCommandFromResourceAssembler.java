package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateKeeperRequestCommand;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateKeeperRequestResource;

public class CreateKeeperRequestCommandFromResourceAssembler {
    public static CreateKeeperRequestCommand toCommandFromResource(CreateKeeperRequestResource resource) {
        return new CreateKeeperRequestCommand(
                resource.name(),
                resource.message(),
                resource.photoUrl(),
                resource.rating()
        );
    }
}