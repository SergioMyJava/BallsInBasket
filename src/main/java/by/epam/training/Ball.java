package by.epam.training;

public class Ball {
    private String color;
    private int weight;

    Ball(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {  this.color = color;
    }
}
