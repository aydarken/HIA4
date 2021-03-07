package kz.lab2;

public class Silver implements Card {
    private String name;
    int silverpercent=10;
    public Silver() {
    }

    public Silver(String name,int silverpercent) {
            this.name = name;
        this.silverpercent = silverpercent;
        }
    public void setName(String name) {
    }
    public void getSilverName(String name) {
        this.name = name;
        System.out.println("Silver");
    }
    public void setSilverName(String name) {
        this.name = name;
        System.out.println("Silver");
    }

    @Override
    public void sale() {
        System.out.println("Silver: " + this.toString());
    }
    @Override
    public String toString() {
        return "\nName of the card:" + name + "\n"+"Percent:"+ silverpercent+"%" +"\n";
    }


}


