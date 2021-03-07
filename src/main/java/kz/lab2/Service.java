package kz.lab2;
public class Service  {
    private String title;
    private int  cost;

    public Service(String title, int  cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int  cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Service=" + title + " Cost:" + cost;
    }
}