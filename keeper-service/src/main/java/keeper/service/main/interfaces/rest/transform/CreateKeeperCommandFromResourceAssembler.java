package keeper.service.main.interfaces.rest.transform;

import keeper.service.main.domain.model.command.CreateKeeperCommand;
import keeper.service.main.interfaces.rest.resource.CreateKeeperResource;

public class CreateKeeperCommandFromResourceAssembler {

    public static CreateKeeperCommand toCommandFromResource(CreateKeeperResource resource){
        return new CreateKeeperCommand(resource.name(), resource.country(), resource.city(),
                resource.streetAddress(), resource.description(), resource.photoUrl(), resource.rating());
    }
}
