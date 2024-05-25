package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllMensajesQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetMensajeriaByIdQuery;
import java.util.List;
import java.util.Optional;

public interface MensajeriaQueryService {
    Optional<Mensajeria> handle(GetMensajeriaByIdQuery query);
    List<Mensajeria> handle(GetAllMensajesQuery query);
}
