package keeper.service.main.interfaces.rest.transform;

import keeper.service.main.domain.model.command.UpdateKeeperCommand;
import keeper.service.main.interfaces.rest.resource.UpdateKeeperResource;

public class UpdateKeeperCommandFromResourceAssembler {

    public static UpdateKeeperCommand toCommandFromResource(Long keeperId, UpdateKeeperResource resource){
        return new UpdateKeeperCommand(keeperId, resource.name(), resource.country(), resource.city(),
                resource.streetAddress(), resource.description(), resource.photoUrl(), resource.rating());
    }
}
