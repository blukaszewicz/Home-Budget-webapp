package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.Holidays;

public interface HolidaysRepository extends JpaRepository<Holidays, Long> {
}
