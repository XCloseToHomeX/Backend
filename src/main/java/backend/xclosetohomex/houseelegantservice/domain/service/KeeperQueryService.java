package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Keeper;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllKeepersQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetKeeperByIdQuery;

import java.util.List;
import java.util.Optional;

public interface KeeperQueryService {
    Optional<Keeper> handle(GetKeeperByIdQuery query);
    List<Keeper> handle(GetAllKeepersQuery query);
}
