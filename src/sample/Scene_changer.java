package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Scene_changer extends Database_Access {
    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
    private static Stage stage;
    String name =" ";

    public Scene_changer(Stage s){
        stage =s;
    }

    public void setname(String s){
      name = s;
    }

    public String getname(){
        return name;
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
        setname(Username.getText());
        PasswordField password = new PasswordField();

        Button login = new Button("Enter");
        login.setTranslateY(140);
        login.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                 stage.setScene(MenuScene(name));
            }
        });
        root.getChildren().addAll(login,Username,password, userLabel, label);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    protected Scene InventoryScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label(sign());
        userLabel.setFont(new Font("Arial", 15));

        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);

        Label Reasonlabel = new Label("Please enter your reason for changing inventory below");
        Reasonlabel.setFont(new Font("Arial", 15));
        Reasonlabel.setTranslateY(-70);

        TextField Reasonbox = new TextField();
        Reasonbox.prefWidth(100);

        Button ReasonButton = new Button("Submit Reason");
        ReasonButton.setTranslateY(100);
        ReasonButton.setTranslateX(100);


        ReasonButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                  String Reason = Reasonbox.getText();
                  Reasonbox.setText("");
            }
        });


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene(getname()));
            }
        });
        root.getChildren().addAll(userLabel,BackButton, Reasonbox, Reasonlabel, ReasonButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    protected Scene RecommendationScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("Hello");
        userLabel.setFont(new Font("Arial", 15));

        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene(getname()));
            }
        });



        root.getChildren().addAll(userLabel,BackButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    protected Scene ReportScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("Hello");
        userLabel.setFont(new Font("Arial", 15));
        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene(getname()));
            }
        });



        root.getChildren().addAll(userLabel,BackButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    protected Scene ReserveScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("Hello");
        userLabel.setFont(new Font("Arial", 15));
        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene(getname()));
            }
        });

        root.getChildren().addAll(userLabel,BackButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }
    protected Scene AddScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        Label userLabel = new Label("Hello");
        userLabel.setFont(new Font("Arial", 15));
        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene(getname()));
            }
        });

        root.getChildren().addAll(userLabel,BackButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    protected Scene MenuScene(String name) {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        Label welcome = new Label("Welcome "+ name + "!" +" What would you like to do today?");
        welcome.setFont(new Font("Arial", 30));
        welcome.setTranslateY(-300);
        Button InventoryButton = new Button("See Inventory");
        InventoryButton.setTranslateY(100);
        InventoryButton.setTranslateX(-300);

        //  Image imageDecline = new Image(getClass().getResourceAsStream("plus-flat.png"));
        Button AddButton = new Button("Add Signs");
        //AddButton.setGraphic(new ImageView(imageDecline));
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

                stage.setScene(InventoryScene());

            }
        });

        AddButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        ReserveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        ComplainButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(RecommendationScene());
            }
        });

        ReportButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        root.getChildren().addAll(InventoryButton, welcome, AddButton, ReportButton, ReserveButton, ComplainButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }





}
