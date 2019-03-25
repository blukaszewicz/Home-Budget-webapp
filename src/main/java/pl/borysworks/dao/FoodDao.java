package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.Food;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class FoodDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Food food) {
        entityManager.persist(food);
    }

    public void update(Food entity) {
        entityManager.merge(entity);
    }

    public void delete(Food entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
