package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private Integer Id;
    private String name;

    public Department(java.lang.Integer id, java.lang.String name) {
        Id = id;
        this.name = name;
    }

    public java.lang.Integer getId() {
        return Id;
    }

    public void setId(java.lang.Integer id) {
        Id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
