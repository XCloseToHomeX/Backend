package keeper.service.main.infrastructure.persistence.jpa.repository;

import keeper.service.main.domain.model.entities.Keeper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeeperRepository extends JpaRepository<Keeper, Long> {
}
