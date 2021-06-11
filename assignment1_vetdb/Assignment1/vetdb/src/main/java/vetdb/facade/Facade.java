package vetdb.facade;

import vetdb.views.CatsView;
import vetdb.views.DogsView;
import vetdb.views.PetsView;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class Facade {

    private static Facade instance;
    private static EntityManagerFactory emf;

    private Facade() {}

    public static Facade getFacadeInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new Facade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<CatsView> getAllCats() {
        EntityManager em = getEntityManager();
        List<CatsView> list;
        try {
            em.getTransaction().begin();
            Query q = em.createQuery("SELECT cv from CatsView cv");
            list = q.getResultList();
        } finally {
            em.close();
        }
        return list;
    }

    public List<DogsView> getAllDogs() {
        EntityManager em = getEntityManager();
        List<DogsView> list;
        try {
            em.getTransaction().begin();
            Query q = em.createQuery("SELECT cv from DogsView cv");
            list = q.getResultList();
        } finally {
            em.close();
        }
        return list;
    }

    public List<PetsView> getAllPets() {
        EntityManager em = getEntityManager();
        List<PetsView> list;
        try {
            em.getTransaction().begin();
            Query q = em.createQuery("SELECT cv from PetsView cv");
            list = q.getResultList();
        } finally {
            em.close();
        }
        return list;
    }
}
