package hw3;

public class Marmalade extends Present {
private int calories;
    private String name;

    public Marmalade(int price, int weight, int calories, String name) {
        super(price, weight);
        this.calories = calories;
        this.name = name;
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Marmalade{" +
                "calories='" + calories  +
                ", name='" + name  +
                '}';
    }
}
