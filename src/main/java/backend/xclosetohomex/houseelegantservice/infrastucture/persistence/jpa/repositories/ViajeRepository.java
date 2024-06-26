package backend.xclosetohomex.houseelegantservice.infrastucture.persistence.jpa.repositories;

import backend.xclosetohomex.houseelegantservice.domain.model.aggregates.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {
    Optional<Viaje> findByTitle(String title);
}
