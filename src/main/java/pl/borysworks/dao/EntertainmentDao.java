package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.Entertainment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class EntertainmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Entertainment entertainment) {
        entityManager.persist(entertainment);
    }

    public void update(Entertainment entity) {
        entityManager.merge(entity);
    }

    public void delete(Entertainment entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
