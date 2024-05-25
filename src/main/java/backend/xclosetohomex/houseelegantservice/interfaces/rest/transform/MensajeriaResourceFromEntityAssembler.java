package backend.xclosetohomex.houseelegantservice.interfaces.rest.transform;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.MensajeriaResource;

public class MensajeriaResourceFromEntityAssembler {
    public static MensajeriaResource toResourceFromEntity(Mensajeria mensajeria) {
        return new MensajeriaResource(mensajeria.getId(), mensajeria.getNombre(), mensajeria.getDescription(),
                mensajeria.getPhotoFace());
    }
}