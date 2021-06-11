package vetdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "vets", schema = "public", catalog = "vetdb")
public class VetsEntity {
    private Long id;
    private int cvr;
    private String name;
    private String street;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "cvr")
    public int getCvr() {
        return cvr;
    }

    public void setCvr(int cvr) {
        this.cvr = cvr;
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

        VetsEntity that = (VetsEntity) o;

        if (cvr != that.cvr) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cvr;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }
}
