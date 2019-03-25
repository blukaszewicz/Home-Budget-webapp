package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.Holidays;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class HolidaysDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Holidays holidays) {
        entityManager.persist(holidays);
    }

    public void update(Holidays entity) {
        entityManager.merge(entity);
    }

    public void delete(Holidays entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
