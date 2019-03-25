package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.HouseMaitnance;

public interface HouseMaitnanceRepository extends JpaRepository<HouseMaitnance, Long> {
}
