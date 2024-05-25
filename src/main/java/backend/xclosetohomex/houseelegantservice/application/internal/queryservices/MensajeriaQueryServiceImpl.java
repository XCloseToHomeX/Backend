package backend.xclosetohomex.houseelegantservice.application.internal.queryservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllMensajesQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetMensajeriaByIdQuery;
import backend.xclosetohomex.houseelegantservice.domain.service.MensajeriaQueryService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeriaQueryServiceImpl implements MensajeriaQueryService {

    private final MensajeriaRepository mensajeriaRepository;

    public MensajeriaQueryServiceImpl(MensajeriaRepository mensajeriaRepository) {
        this.mensajeriaRepository = mensajeriaRepository;
    }

    @Override
    public Optional<Mensajeria> handle(GetMensajeriaByIdQuery query) {
        return mensajeriaRepository.findById(query.mensajeriaId());
    }

    @Override
    public List<Mensajeria> handle(GetAllMensajesQuery query) {
        return mensajeriaRepository.findAll();
    }
}