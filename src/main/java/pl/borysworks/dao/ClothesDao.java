package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.Clothes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class ClothesDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Clothes clothes) {
        entityManager.persist(clothes);
    }

    public void update(Clothes entity) {
        entityManager.merge(entity);
    }

    public void delete(Clothes entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
