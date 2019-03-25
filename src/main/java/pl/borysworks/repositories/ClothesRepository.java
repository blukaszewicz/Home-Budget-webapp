package pl.borysworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.borysworks.entity.Clothes;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
