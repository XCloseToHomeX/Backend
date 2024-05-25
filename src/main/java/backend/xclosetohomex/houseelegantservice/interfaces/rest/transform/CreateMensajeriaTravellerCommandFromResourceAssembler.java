package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;


import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateMensajeriaTravellerCommand;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateMensajeriaTravellerResource;

public class CreateMensajeriaTravellerCommandFromResourceAssembler {
    public static CreateMensajeriaTravellerCommand toCommandFromResource(CreateMensajeriaTravellerResource resource)  {
        return new CreateMensajeriaTravellerCommand(
                resource.nombre(),
                resource.description(),
                resource.photoFace()
        );

    }
}
