package vetdb.database;

import vetdb.entities.CatsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");

    private EntityManager em;


    public Factory(EntityManager em) {
        this.em = factory.createEntityManager();
    }

    public EntityManager getEm() {
        return em;
    }
}
