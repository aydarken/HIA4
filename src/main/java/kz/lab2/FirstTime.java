package kz.lab2;

public class FirstTime implements Card {
    private String name;
    int firstpercent = 10;

    public FirstTime() {

    }

    public FirstTime(String name, int firstpercent) {
        this.name = name;
        this.firstpercent = firstpercent;
    }

    public void setName(String name) {
    }

    public void getFirstName(String name) {
        this.name = name;
        System.out.println("Silver");
    }

    public void setFirstName(String name) {
        this.name = name;
        System.out.println("Silver");
    }

    @Override
    public void sale() {
        System.out.println("Silver: " + this.toString());
    }

    @Override
    public String toString() {
        return "\nName of the card:" + name + "\n" + "Percent:" + firstpercent + "%" + "\n";
    }


}
