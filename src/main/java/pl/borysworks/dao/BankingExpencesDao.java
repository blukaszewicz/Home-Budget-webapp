package pl.borysworks.dao;
import org.springframework.stereotype.Component;
import pl.borysworks.entity.BankingExpences;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class BankingExpencesDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(BankingExpences bankingExpences) {
        entityManager.persist(bankingExpences);
    }

    public void update(BankingExpences entity) {
        entityManager.merge(entity);
    }

    public void delete(BankingExpences entity) {
        entityManager.remove(entityManager.contains(entity) ?
                entity : entityManager.merge(entity));
    }


}
