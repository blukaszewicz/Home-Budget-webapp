package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.HouseMaitnance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class HouseMaitnanceDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(HouseMaitnance houseMaitnance) {
        entityManager.persist(houseMaitnance);
    }

    public void update(HouseMaitnance entity) {
        entityManager.merge(entity);
    }

    public void delete(HouseMaitnance entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
