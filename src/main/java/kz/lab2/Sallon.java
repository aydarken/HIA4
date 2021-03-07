package kz.lab2;
import java.util.ArrayList;

public class Sallon {

    public ArrayList<Service> services = new ArrayList<>();
    public ArrayList<Product> products = new ArrayList<>();

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return   "\n1) Services: "+ services+"\n2) Products: "+ products;

    }
}
