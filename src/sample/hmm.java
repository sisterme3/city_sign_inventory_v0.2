package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class hmm extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("City Sign Inventory Management");
        Scene scene = logInScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Scene logInScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        Label userLabel = new Label("Welcome to the City Sign Inventory Management App");
        userLabel.setFont(new Font("Arial", 30));
        userLabel.setTranslateY(-200);
        Label label = new Label("Please login below!!!");
        label.setFont(new Font("Arial", 30));
        label.setTranslateY(-200);

        label.setAlignment(Pos.CENTER);
        TextField Username = new TextField();
        Username.prefWidth(100);

        PasswordField password = new PasswordField();

        Button login = new Button("Enter");
        login.setTranslateY(140);
        login.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(CreateAccountScene(Username.getText()));
            }
        });
        root.getChildren().addAll(login,Username,password, userLabel, label);
        return new Scene(root, 1000, 875);
    }

    protected Scene CreateAccountScene(String name) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Label welcome = new Label("Welcome " + name + "! What would you like to do today?");
        welcome.setFont(new Font("Arial", 30));
        welcome.setTranslateY(-300);
        Button InventoryButton = new Button("See Inventory");
        InventoryButton.setTranslateY(100);
        InventoryButton.setTranslateX(-300);

        Image imageDecline = new Image(getClass().getResourceAsStream("plus-flat.png"));
        Button AddButton = new Button("Add Signs");
        AddButton.setGraphic(new ImageView(imageDecline));
        AddButton.setTranslateY(100);
        AddButton.setTranslateX(-100);
        AddButton.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");


        Button ReserveButton = new Button("Reserve Signs");
        ReserveButton.setTranslateY(100);
        ReserveButton.setTranslateX(-100);

        Button ComplainButton = new Button("Recommendation");
        ComplainButton.setTranslateY(100);
        ComplainButton.setTranslateX(0);

        Button ReportButton = new Button("Report a Problem");
        ReportButton.setTranslateY(100);
        ReportButton.setTranslateX(100);


        InventoryButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

            }
        });
        root.getChildren().addAll(InventoryButton, welcome,AddButton,ReportButton,ReserveButton,ComplainButton);
        return new Scene(root, 1000, 875);
    }

    public static void main(String[] args) {
        launch(args);
    }
}