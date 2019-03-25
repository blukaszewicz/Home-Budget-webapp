package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.HouseInvestments;

public interface HouseInvestmentsRepository extends JpaRepository<HouseInvestments, Long> {
}
