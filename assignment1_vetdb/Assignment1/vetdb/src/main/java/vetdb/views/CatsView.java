package vetdb.views;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cats_view", schema = "public", catalog = "vetdb")
public class CatsView implements Serializable {

    @Id
    private int id;
    private int age, life_count, vet_cvr;
    private String name;

    public CatsView(int id, int age, int life_count, int vet_cvr, String name) {
        this.id = id;
        this.age = age;
        this.vet_cvr = vet_cvr;
        this.life_count = life_count;
        this.name = name;
    }

    public CatsView(int age, int life_count, int vet_cvr, String name) {
        this.age = age;
        this.life_count = life_count;
        this.vet_cvr = vet_cvr;
        this.name = name;
    }

    @Basic
    @Column(name = "vet_cvr")
    public int getCvr() {
        return vet_cvr;
    }

    public void setCvr(int vet_cvr) {
        this.vet_cvr = vet_cvr;
    }

    public CatsView() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "life_count")
    public int getLifes() {
        return life_count;
    }

    public void setLifes(int life_count) {
        this.life_count = life_count;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CatsView{" +
                "id=" + id +
                ", age=" + age +
                ", lives=" + life_count +
                ", vetCvr=" + vet_cvr +
                ", name='" + name + '\'' +
                '}';
    }
}
