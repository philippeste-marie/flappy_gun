package src.classes;

public class ScrollManager {
    //  Vitesse initiale de 120
    private double scrollSpeed = 120;

    // Augmentation de 10 par goldCoin
    private double increasePerCoin = 10;

    public ScrollManager(double scrollSpeed, double increasePerCoin) {
        this.scrollSpeed = scrollSpeed;
        this.increasePerCoin = increasePerCoin;
    }

    public double getScrollSpeed() {
        return this.scrollSpeed;
    }

    public void increaseSpeed() {
        this.scrollSpeed += increasePerCoin;
    }
}