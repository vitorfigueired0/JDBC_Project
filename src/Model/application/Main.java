package Model.application;

import Model.entities.Department;
import Model.entities.Seller;

public class Main {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
        Seller seller = new Seller(1, "Vitor", "vitor@gmail.com", "17/05/2001", 4000.0);
        System.out.println(seller);
    }
}
