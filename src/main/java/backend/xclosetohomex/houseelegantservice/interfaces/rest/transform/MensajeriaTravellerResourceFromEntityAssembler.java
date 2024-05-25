package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.MensajeriaTraveller;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.MensajeriaTravellerResource;

public class MensajeriaTravellerResourceFromEntityAssembler {
    public static MensajeriaTravellerResource toResourceFromEntity(MensajeriaTraveller mensajeriaTraveller) {
        return new MensajeriaTravellerResource(mensajeriaTraveller.getId(), mensajeriaTraveller.getNombre(), mensajeriaTraveller.getDescription(),
                mensajeriaTraveller.getPhotoFace());
    }
}
