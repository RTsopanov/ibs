package hw3;

public class Candy extends Present {
    private String manufacturer;
    String name;

    public Candy(int price, int weight, String manufacturer, String name) {
        super(price, weight);
        this.manufacturer = manufacturer;
        this.name = name;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Candy{" +
                "manufacturer='" + manufacturer  +
                ", name='" + name  +
                '}';
    }
}


