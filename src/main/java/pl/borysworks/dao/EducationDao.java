package pl.borysworks.dao;


import org.springframework.stereotype.Component;
import pl.borysworks.entity.Education;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class EducationDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Education education) {
        entityManager.persist(education);
    }

    public void update(Education entity) {
        entityManager.merge(entity);
    }

    public void delete(Education entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
