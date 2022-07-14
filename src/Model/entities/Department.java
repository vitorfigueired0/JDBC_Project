package Model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private Integer ID;
    private String name;

    public Department(){}
    public Department(Integer ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Department: \n ID: "
                + ID
                +" ,Name: "
                +name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getID(), that.getID()) && Objects.equals(getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName());
    }
}
