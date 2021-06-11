package vetdb.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cats", schema = "public", catalog = "vetdb")
public class CatsEntity {
    private int id;
    private Integer lifeCount;

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
    @Column(name = "life_count")
    public Integer getLifeCount() {
        return lifeCount;
    }

    public void setLifeCount(Integer lifeCount) {
        this.lifeCount = lifeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatsEntity that = (CatsEntity) o;
        return id == that.id && Objects.equals(lifeCount, that.lifeCount);
    }

    @Override
    public String toString() {
        return "CatsEntity{" +
                "id=" + id +
                ", lifeCount=" + lifeCount +
                '}';
    }
}
