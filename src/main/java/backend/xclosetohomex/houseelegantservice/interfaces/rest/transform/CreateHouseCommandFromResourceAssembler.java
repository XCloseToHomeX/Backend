package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateHouseCommand;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateHouseResource;

public class CreateHouseCommandFromResourceAssembler {
    public static CreateHouseCommand toCommandFromResource(CreateHouseResource resource){
        return new CreateHouseCommand(resource.country(), resource.city(), resource.streetAddress(),
                resource.price(), resource.capacity(), resource.rating(), resource.photoUrl());
    }
}
