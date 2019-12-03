package sample;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
    private static Stage stage;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Scene_changer sc = new Scene_changer(primaryStage);
        stage.setTitle("City Sign Inventory Management");
        Scene scene = sc.logInScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}