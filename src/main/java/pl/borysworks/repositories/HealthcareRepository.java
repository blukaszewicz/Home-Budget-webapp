package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.Healthcare;

public interface HealthcareRepository extends JpaRepository<Healthcare, Long> {
}
