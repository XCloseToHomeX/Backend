package backend.xclosetohomex.houseelegantservice.application.internal.commandservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Mensajeria;
import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateMensajeriaCommand;
import backend.xclosetohomex.houseelegantservice.domain.service.MensajeriaCommandService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.MensajeriaRepository;
import org.springframework.stereotype.Service;

@Service
public class MensajeriaCommandServiceImpl implements MensajeriaCommandService {
    private final MensajeriaRepository mensajeriaRepository;

    public MensajeriaCommandServiceImpl(MensajeriaRepository mensajeriaRepository) {
        this.mensajeriaRepository = mensajeriaRepository;
    }


    @Override
    public Long handle(CreateMensajeriaCommand command) {
        var mensajeria = new Mensajeria(command.nombre(), command.description(), command.photoFace());
        mensajeriaRepository.save(mensajeria);
        return mensajeria.getId();
    }
}