package vetdb.entities;

import javax.persistence.*;

@Entity
@Table(name = "dogs", schema = "public", catalog = "vetdb")
public class DogsEntity {
    private int id;
    private String barkPitch;

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
    @Column(name = "bark_pitch")
    public String getBarkPitch() {
        return barkPitch;
    }

    public void setBarkPitch(String barkPitch) {
        this.barkPitch = barkPitch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogsEntity that = (DogsEntity) o;

        if (id != 0 ? id != that.id : that.id != 0) return false;
        if (barkPitch != null ? !barkPitch.equals(that.barkPitch) : that.barkPitch != null) return false;

        return true;
    }
}
