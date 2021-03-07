package kz.lab2;

public class Premium implements Card{
    private String name;
    int  premiumpercent=20;
    public Premium() {

    }

    public Premium(String name, int  premium) {
        this.name = name;
        this. premiumpercent= premiumpercent;
    }
    public void getName(String name) {
        this.name = name;
        System.out.println("Premium");
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("Premium");
    }
    @Override
    public void sale() {
        System.out.println("Premium: " + this.toString());
    }
    @Override
    public String toString() {
        return "\nName of the card:" + name +"\n"+"Percent:"+  premiumpercent+"%" +"\n";
    }
}
