package keeper.service.main.interfaces.rest.transform;

import keeper.service.main.domain.model.entities.Keeper;
import keeper.service.main.interfaces.rest.resource.KeeperResource;

public class KeeperResourceFromEntityAssembler {

    public static KeeperResource toResourceFromEntity(Keeper keeper){
        return new KeeperResource(keeper.getId(), keeper.getName(), keeper.getCountry(), keeper.getCity(),
                keeper.getStreetAddress(), keeper.getDescription(), keeper.getPhotoUrl(), keeper.getRating());
    }
}
