package keeper.service.main.domain.service;

import keeper.service.main.domain.model.command.CreateKeeperCommand;
import keeper.service.main.domain.model.command.UpdateKeeperCommand;
import keeper.service.main.domain.model.entities.Keeper;

import java.util.Optional;

public interface KeeperCommandService {

    Long handle (CreateKeeperCommand command);
    Optional<Keeper> handle (UpdateKeeperCommand command);
}
