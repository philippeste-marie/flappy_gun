package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import src.classes.Enemy;

public class MainGame extends Application{

    // Début du jeu
    @Override
    public void start(Stage mainStage){

        // Panneau du jeu
        Pane root = new Pane();

        // création de la scène
        Scene scene = new Scene(root, 640, 400);

        // Instanciation de l'enemy et ajout à la scène
        Enemy enemy = new Enemy("/images/enemy.png", 100, 100);
        root.getChildren().add(enemy.getModel());

        // Affichage de la scène
        mainStage.setTitle("Jeu simple");
        mainStage.setScene(scene);
        mainStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}