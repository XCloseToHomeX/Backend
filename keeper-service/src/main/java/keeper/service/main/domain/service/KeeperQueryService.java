package keeper.service.main.domain.service;


import keeper.service.main.domain.model.entities.Keeper;
import keeper.service.main.domain.model.query.GetAllKeepersQuery;
import keeper.service.main.domain.model.query.GetKeeperByIdQuery;

import java.util.List;
import java.util.Optional;

public interface KeeperQueryService {
    List<Keeper> handle (GetAllKeepersQuery query);
    Optional<Keeper> handle (GetKeeperByIdQuery query);
}
