package Model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Seller implements Serializable {
    private Integer ID;
    private String name;
    private String email;
    private String birthDate;
    private Double baseSalary;

    public Seller(){}
    public Seller(Integer ID, String name, String email, String birthDate, Double baseSalary){
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
    }

    public Integer getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString(){
        return "Seller: \n ID: "
                + ID + " ,Name: "
                + name + " ,E-mail: "
                + email + " ,Birth: \n"
                + birthDate + " ,Salary: "
                + baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return Objects.equals(getID(), seller.getID()) && Objects.equals(getName(),
                seller.getName()) && Objects.equals(getEmail(), seller.getEmail()) && Objects.equals(getBirthDate(),
                seller.getBirthDate()) && Objects.equals(getBaseSalary(), seller.getBaseSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getEmail(), getBirthDate(), getBaseSalary());
    }
}
