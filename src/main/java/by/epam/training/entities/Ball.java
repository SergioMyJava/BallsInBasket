package by.epam.training.entities;

public class Ball {
    private String color;
    private int weight;

    public Ball(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return weight == ball.weight &&
                color.equals( ball.color);
    }

    @Override
    public int hashCode() {
        return color.hashCode() + weight;
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + " color: " + color + ", weight: " + weight;
    }
}
