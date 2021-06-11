package vetdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "caretakers", schema = "public", catalog = "vetdb")
public class CaretakersEntity {
    private int id;
    private String name;
    private String street;

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
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CaretakersEntity that = (CaretakersEntity) o;

        if (id != 0 ? id != that.id : that.id != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;

        return true;
    }
}
