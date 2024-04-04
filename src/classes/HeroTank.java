package src.classes;

// Packages de JavaFX pour l'image
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class HeroTank extends Hero{
    private ImageView model;
    private double speedX;
    private double speedY;
    private int goldCoins = 8;

    private Random random = new Random();

    // Constructeur
    public HeroTank(String pathToImage, double posX, double posY, double speedX, double height, double width) {
        super(posX, posY, speedX);
        Image image = new Image(pathToImage);
        model = new ImageView(image);
        model.setStyle("-fx-background-color: transparent;");
        model.setFitHeight(height);
        model.setFitWidth(width);
        model.setPreserveRatio(true);
        model.setX(posX);
        model.setY(posY);
        this.speedY = 0;
    }

    @Override
    public double xMovement(double elapsedTime) {
        if ((int) (elapsedTime * 2) % 2 == 0) {
            double amplitude = (double) random.nextInt(31);
            int sign = random.nextInt(2) + 1;
            return amplitude * Math.pow((-1), sign);
        }
        else return 0;
    }

    @Override
    public double yMovement(double elapsedTime) {
        if ((int) (elapsedTime * 2) % 2 == 0)  {
            double amplitude = (double) random.nextInt(31);
            int sign = random.nextInt(2) + 1;
            return amplitude * Math.pow((-1), sign);
        }
        else return 0;
    }

    @Override
    public void update(double deltaTime, double elapsedTime) {

        this.posX += this.speedX * deltaTime + xMovement(elapsedTime);

        this.posY += this.speedY * deltaTime + yMovement(elapsedTime);
    }
}
