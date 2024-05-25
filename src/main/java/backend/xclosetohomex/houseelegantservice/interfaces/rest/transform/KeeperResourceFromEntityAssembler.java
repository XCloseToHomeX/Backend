package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Keeper;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.KeeperResource;

public class KeeperResourceFromEntityAssembler {
    public static KeeperResource toResourceFromEntity(Keeper keeper){
        return new KeeperResource(keeper.getId(), keeper.getName(), keeper.getCountry(), keeper.getCity(),
                keeper.getStreetAddress(), keeper.getDescription(), keeper.getPhotoUrl(), keeper.getRating());
    }
}
