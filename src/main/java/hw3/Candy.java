package hw3;

public class Candy {

    private String name;
    private int id;
    private int weight;
    private int price;


    public Candy(String name, int id, int price, int weight) {
        this.price = price;
        this.weight = weight;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\nname = " + name + "\nid = " + id + "\nweight = " + weight + "\nprice = " + price;
    }


}


