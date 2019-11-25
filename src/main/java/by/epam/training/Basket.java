package by.epam.training;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int blueBalls = 0;
    private int weightBalls = 0;
    private List<Ball> basketBalls;

    Basket() {
        basketBalls = new ArrayList();
    }

    public void addBall(Ball newball) {
        weightBalls += newball.getWeight();
        if (newball.getColor() == "Blue") {
            blueBalls++;
        }
        basketBalls.add(newball);
    }

    public int getWeight() {
        return weightBalls;
    }

    public int getBlueBalls() {
        return blueBalls;
    }

    public void deleteBall() {
        if (basketBalls.size() == 0) {
            System.out.println("No balls in the basket.");
        } else {
            System.out.println("Last ball removed");
            Ball fromList = basketBalls.get(basketBalls.size() - 1);
            if (fromList.getColor() == "Blue") {
                blueBalls--;
            }
            weightBalls -= fromList.getWeight();
            basketBalls.remove(basketBalls.size() - 1);
        }
    }
}
