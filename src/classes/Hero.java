package src.classes;

public abstract class Hero {
    protected double posX;
    protected double posY;
    protected double speedX;
    protected int goldCoins;

    public Hero (double posX, double posY, double speedX) {
        this.posX = posX;
        this.posY = posY;
        this.speedX = speedX;
    }
}
