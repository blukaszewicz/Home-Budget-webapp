package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
