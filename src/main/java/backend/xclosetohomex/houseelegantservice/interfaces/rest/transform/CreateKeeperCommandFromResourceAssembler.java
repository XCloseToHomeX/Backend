package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateKeeperCommand;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateKeeperResource;

public class CreateKeeperCommandFromResourceAssembler {
    public static CreateKeeperCommand toCommandFromResource(CreateKeeperResource resource){
        return new CreateKeeperCommand(resource.name(), resource.country(), resource.city(),
                resource.streetAddress(), resource.description(), resource.photoUrl(), resource.rating());
    }
}
