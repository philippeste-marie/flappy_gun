package src.classes;

// Packages de JavaFX pour l'image
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Background {

    private ImageView model;
    private double speedX;
    private double posX;

    public Background(String pathToImage, double speedX) {
        Image image = new Image(pathToImage);
        this.model = new ImageView(image);
        model.setX(posX);
        this.speedX = speedX;
    }

    public void update(double timeDelta, double elapsedTime){
        this.posX += this.speedX * timeDelta;
        this.model.setX(this.posX);
    }
}
