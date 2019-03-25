package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
