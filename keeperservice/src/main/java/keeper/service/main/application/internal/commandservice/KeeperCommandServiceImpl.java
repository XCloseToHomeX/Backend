package keeper.service.main.application.internal.commandservice;

import keeper.service.main.domain.model.command.CreateKeeperCommand;
import keeper.service.main.domain.model.command.UpdateKeeperCommand;
import keeper.service.main.domain.model.entities.Keeper;
import keeper.service.main.domain.service.KeeperCommandService;
import keeper.service.main.infrastructure.persistence.jpa.repository.KeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KeeperCommandServiceImpl implements KeeperCommandService {

    @Autowired
    KeeperRepository keeperRepository;

    @Override
    public Long handle(CreateKeeperCommand command) {
        Keeper newKeeper = new Keeper(command.name(), command.country(), command.city(),
                command.streetAddress(), command.description(), command.photoUrl(), command.rating());
        keeperRepository.save(newKeeper);
        return newKeeper.getId();
    }

    @Override
    public Optional<Keeper> handle(UpdateKeeperCommand command) {
        Keeper keeper = keeperRepository.findById(command.id()).orElse(null);
        if(keeper == null) return Optional.empty();
        Keeper updatedKeeper = updateKeeper(keeper, command);
        keeperRepository.save(updatedKeeper);
        return Optional.of(updatedKeeper);
    }

    private Keeper updateKeeper(Keeper keeper, UpdateKeeperCommand command){
        keeper.setName(command.name());
        keeper.setCountry(command.country());
        keeper.setCity(command.city());
        keeper.setStreetAddress(command.streetAddress());
        keeper.setDescription(command.description());
        keeper.setPhotoUrl(command.photoUrl());
        keeper.setRating(command.rating());
        return keeper;
    }
}
