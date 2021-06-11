package vetdb.views;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "Dogs_view", schema = "public", catalog = "vetdb")
public class DogsView {
    @Id
    private int id;
    private int age, vet_cvr;
    private String name, bark_pitch;

    public DogsView(int id, int age, int vet_cvr, String name, String bark_pitch) {
        this.id = id;
        this.age = age;
        this.vet_cvr = vet_cvr;
        this.bark_pitch = bark_pitch;
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

    public DogsView() { }

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
    @Column(name = "bark_pitch")
    public String getBarkPitch() {
        return bark_pitch;
    }

    public void setBarkPitch(String bark_pitch) {
        this.bark_pitch = bark_pitch;
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
        return "DogsView{" +
                "id=" + id +
                ", age=" + age +
                ", vet_cvr=" + vet_cvr +
                ", name='" + name + '\'' +
                ", bark_pitch='" + bark_pitch + '\'' +
                '}';
    }
}
