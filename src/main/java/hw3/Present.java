package hw3;



public class Present {
    private int weight;
    private int price;
    private Candy candy;
    private Marmalade marmalade;




    public Present(int price, int weight) {
        this.weight = weight;
        this.price = price;
    }

    public Present(Candy candy, Marmalade marmalade) {
        this.candy = candy;
        this.marmalade = marmalade;
        weight = candy.getWeight() + marmalade.getWeight();
        price = candy.getPrice() + marmalade.getPrice();
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


    public int findWeight(Present present) {

        return weight;
    }


    @Override
    public String toString() {
        return
                "Present:\n"
                        + "weight = " + weight + "\nprice = " + price
                        + "\n\nCandy: " + candy.toString() + "\n\nMarmalade: " + marmalade.toString()
                ;

    }
}
