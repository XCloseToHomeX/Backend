package backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Mensajeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeriaRepository extends JpaRepository<Mensajeria, Long> {

}