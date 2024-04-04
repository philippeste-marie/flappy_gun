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

    public double xMovement(double elapsedTime) {
        return 0;
    }
    public double yMovement(double elapsedTime) {
        return 0;
    }

    public void update(double timeDelta, double elapsedTime) {

    }
}
