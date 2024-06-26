package backend.xclosetohomex.houseelegantservice.application.internal.queryservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.MensajeriaTraveller;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllMensajesQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetMensajeriaTravellerByIdQuery;
import backend.xclosetohomex.houseelegantservice.domain.service.MensajeriaTravellerQueryService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaTravellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeriaTravellerQueryServiceImpl implements MensajeriaTravellerQueryService {
    private final MensajeriaTravellerRepository mensajeriaTravellerRepository;

    public MensajeriaTravellerQueryServiceImpl(MensajeriaTravellerRepository mensajeriaTravellerRepository) {
        this.mensajeriaTravellerRepository = mensajeriaTravellerRepository;
    }

    @Override
    public Optional<MensajeriaTraveller> handle(GetMensajeriaTravellerByIdQuery query) {
        return mensajeriaTravellerRepository.findById(query.mensajeriaTravellerId());
    }

    @Override
    public List<MensajeriaTraveller> handle(GetAllMensajesQuery query) {
        return mensajeriaTravellerRepository.findAll();
    }
}
