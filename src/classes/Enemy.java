package src.classes;

// Packages de JavaFX pour l'image
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Enemy {

    // Liste d'attributs de l'enemy
    private ImageView model;
    private double speedX;
    private double speedY;
    private double posX;
    private double posY;
    private double gravity;
    private final double initialSpeedX = 120;
    private final double maxSpeedY = 300;
    private double health;

    // Constructeur
    public Enemy(String pathToImage, double posX, double posY, double height, double width) {
        Image image = new Image(pathToImage);
        model = new ImageView(image);
        model.setStyle("-fx-background-color: transparent;");
        model.setFitHeight(height);
        model.setFitWidth(width);
        model.setPreserveRatio(true);
        this.posX = posX;
        this.posY = posY;
        model.setX(posX);
        model.setY(posY);
        speedX = initialSpeedX;
        speedY = 0;
        gravity = 500;
        health = 100;
    }

    // Méthode pour obtenir healht
    public double getHealth() {
        return health;
    }

    // Méthode qui retourne le model
    public ImageView getModel() {
        return model;
    }

    public void setHealth(double hp) {
        health = hp;
    }

    // Update des attributs de l'enemy et de son modèle affiché pour une tranche de temps
    public void update(double time) {

        // update de la vitesse
        speedY += gravity * time;


        if (speedY > maxSpeedY) {
            speedY = maxSpeedY;
        }
        if (speedY < -maxSpeedY) {
            speedY = -maxSpeedY;
        }

        // update de la position
        posX += speedX * time;
        posY += speedY * time;

        model.setX(posX);
        model.setY(posY);

        // vérifier si l'enemy doit rebondir
        bounce();
    }

    // Méthode qui permet à l'enemy de rebondir s'il touche au bord
    public void bounce(){
        // On considère que l'enemy rebondi si le modèle de son image touche au bord
        if (posY < 0 ) {
            posY = 0;
            speedY = -speedY;
        }
        else if (posY > 400 - model.getImage().getHeight()) {
            posY = 400 - model.getImage().getHeight();
            speedY = -speedY;
        }
    }

    // Méthode pour sauter
    public void jump() {
        speedY = -maxSpeedY;
    }
}
