package vetdb.database;

import vetdb.facade.Facade;
import vetdb.views.CatsView;
import vetdb.views.DogsView;
import vetdb.views.PetsView;

import javax.persistence.*;
import java.util.List;

public class Resources {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    private Facade facade = Facade.getFacadeInstance(emf);

    public void getAllCats() {
        List<CatsView> cats = facade.getAllCats();
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }

    public void getAllDogs() {
        List<DogsView> dogs = facade.getAllDogs();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }
    }

    public void getAllPets() {
        List<PetsView> pets = facade.getAllPets();
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }
}
