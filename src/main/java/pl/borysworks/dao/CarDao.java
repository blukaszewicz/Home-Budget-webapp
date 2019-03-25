package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class CarDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Car car) {
        entityManager.persist(car);
    }

    public void update(Car entity) {
        entityManager.merge(entity);
    }

    public void delete(Car entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }



}
