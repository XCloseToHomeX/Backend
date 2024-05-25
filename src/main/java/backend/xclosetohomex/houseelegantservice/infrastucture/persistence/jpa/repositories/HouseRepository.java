package backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
}
