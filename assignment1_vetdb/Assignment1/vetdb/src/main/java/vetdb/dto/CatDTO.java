package vetdb.dto;

import vetdb.entities.CatsEntity;
import vetdb.entities.PetsEntity;

public class CatDTO {

    private int id, age, cvr, life_count;
    private String name;

    public CatDTO() { }

    public CatDTO(CatsEntity cats, PetsEntity pets) {
        this.id = cats.getId();
        this.age = pets.getAge();
        this.cvr = pets.getVetCvr();
        this.life_count = cats.getLifeCount();
        this.name = pets.getName();
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getLife_count() {
        return life_count;
    }

    public String getName() {
        return name;
    }
}
