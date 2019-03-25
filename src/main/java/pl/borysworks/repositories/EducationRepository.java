package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
