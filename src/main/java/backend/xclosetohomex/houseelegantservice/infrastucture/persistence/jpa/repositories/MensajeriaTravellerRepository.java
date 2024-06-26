package backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.MensajeriaTraveller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeriaTravellerRepository extends JpaRepository<MensajeriaTraveller, Long> {

}