package src.classes;

// Packages de JavaFX pour l'image
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class HeroCorps extends Hero{
    private ImageView model;
    private double speedX;
    private double speedY;
    private int goldCoins = 5;

    // Constructeur
    public HeroCorps(String pathToImage, double posX, double posY, double speedX, double height, double width) {
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
    public void update(double time, double elapsedTimed) {

        this.posX += speedX * time;

        this.posY += speedY * time;
    }
}
