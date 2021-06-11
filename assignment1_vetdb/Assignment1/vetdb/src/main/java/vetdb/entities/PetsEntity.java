package vetdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "pets", schema = "public", catalog = "vetdb")
public class PetsEntity {
    private int id;
    private String name;
    private int age;
    private int vetCvr;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "vet_cvr")
    public int getVetCvr() {
        return vetCvr;
    }

    public void setVetCvr(int vetCvr) {
        this.vetCvr = vetCvr;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PetsEntity that = (PetsEntity) o;

        if (age != that.age) return false;
        if (id != 0 ? id != that.id : that.id != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "PetsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", vetCvr=" + vetCvr +
                '}';
    }
}
