package pl.borysworks.dao;
import org.springframework.stereotype.Component;
import pl.borysworks.entity.AnimalsAndGarden;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class AnimalsAndGardenDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(AnimalsAndGarden animalsAndGarden) {
        entityManager.persist(animalsAndGarden);
    }

    public void update(AnimalsAndGarden entity) {
        entityManager.merge(entity);
    }

    public void delete(AnimalsAndGarden entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }


}
