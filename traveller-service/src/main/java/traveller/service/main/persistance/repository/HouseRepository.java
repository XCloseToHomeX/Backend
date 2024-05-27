package traveller.service.main.persistance.repository;

import traveller.service.main.domain.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}