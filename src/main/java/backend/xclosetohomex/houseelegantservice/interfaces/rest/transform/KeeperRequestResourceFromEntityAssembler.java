package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.KeeperRequestResource;

public class KeeperRequestResourceFromEntityAssembler {
    public static KeeperRequestResource toResourceFromEntity(KeeperRequest keeperRequest) {
        return new KeeperRequestResource(keeperRequest.getId(), keeperRequest.getName(), keeperRequest.getMessage(),
                keeperRequest.getPhotoUrl(), keeperRequest.getRating());
    }
}