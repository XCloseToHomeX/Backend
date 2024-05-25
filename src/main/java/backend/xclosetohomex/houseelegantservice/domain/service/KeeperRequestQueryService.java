package backend.xclosetohomex.houseelegantservice.domain.service;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.KeeperRequest;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetKeeperRequestAllQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetKeeperRequestByIdQuery;

import java.util.List;
import java.util.Optional;

public interface KeeperRequestQueryService {
    Optional<KeeperRequest> handle(GetKeeperRequestByIdQuery query);
    List<KeeperRequest> handle(GetKeeperRequestAllQuery query);
}
