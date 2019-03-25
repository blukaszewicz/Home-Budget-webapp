package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.Healthcare;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class HealthcareDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Healthcare healthcare) {
        entityManager.persist(healthcare);
    }

    public void update(Healthcare entity) {
        entityManager.merge(entity);
    }

    public void delete(Healthcare entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
