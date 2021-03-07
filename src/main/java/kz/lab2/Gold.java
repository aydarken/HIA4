package kz.lab2;

public class Gold implements Card {

    private String name;
    int goldpercent = 15;

    public Gold() {

    }

    public Gold(String name, int goldpercent) {
        this.name = name;
        this.goldpercent = goldpercent;
    }

    public void getName(String name) {
        this.name = name;
        System.out.println("Gold");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Gold");
    }

    public void setGoldpercent(int goldpercent) {
        this.goldpercent = goldpercent;
        System.out.println("Gold");
    }

    @Override
    public void sale() {
        System.out.println("Gold:\n " + this.toString());
    }

    @Override
    public String toString() {
        return "\nName of the card:" + name + "\n" + "Percent:" + goldpercent + "%" + "\n";
    }
}



