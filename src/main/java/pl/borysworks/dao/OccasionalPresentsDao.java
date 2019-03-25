package pl.borysworks.dao;


import org.springframework.stereotype.Component;
import pl.borysworks.entity.OccasionalPresents;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class OccasionalPresentsDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(OccasionalPresents p) {
        entityManager.persist(p);
    }

    public void update(OccasionalPresents entity) {
        entityManager.merge(entity);
    }

    public void delete(OccasionalPresents entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }


}
