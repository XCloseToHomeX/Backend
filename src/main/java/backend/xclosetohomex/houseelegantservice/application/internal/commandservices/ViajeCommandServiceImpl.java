package backend.xclosetohomex.houseelegantservice.application.internal.commandservices;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Viaje;
import backend.xclosetohomex.houseelegantservice.domain.model.command.CreateViajeCommand;
import backend.xclosetohomex.houseelegantservice.domain.service.ViajeCommandService;
import backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories.ViajeRepository;
import org.springframework.stereotype.Service;

@Service
public class ViajeCommandServiceImpl implements ViajeCommandService {
    private final ViajeRepository viajeRepository;

    public ViajeCommandServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public Long handle(CreateViajeCommand command) {
        viajeRepository.findByTitle(command.title()).map(viaje -> {
            throw new IllegalArgumentException("Viaje with title " + command.title() + " already exists");
        });
        var viaje = new Viaje(command.title(), command.description(), command.photoUrl(), command.rating());
        viajeRepository.save(viaje);
        return viaje.getId();
    }
}
