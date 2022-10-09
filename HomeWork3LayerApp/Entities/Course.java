package HomeWork3LayerApp.Entities;

public class Course {
    private int id;
    private String name;
    private double price;

    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int myid) {
        if (myid<0){
            myid = 0;
        }
        this.id = myid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0.0){
            price = 0.0;
        }
        this.price = price;
    }
}
