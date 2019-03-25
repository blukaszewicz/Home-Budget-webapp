package pl.borysworks.dao;

import org.springframework.stereotype.Component;
import pl.borysworks.entity.HouseInvestments;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class HouseInvestmentsDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(HouseInvestments houseInvestments) {
        entityManager.persist(houseInvestments);
    }

    public void update(HouseInvestments entity) {
        entityManager.merge(entity);
    }

    public void delete(HouseInvestments entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }

}
