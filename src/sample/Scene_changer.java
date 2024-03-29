package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;


/**
 * This class contains the scenes for each scene within the
 * City Sign Inventory Management System.
 */
public class Scene_changer extends Database_Access {
    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
    private static Stage stage;
    String name =" ";

    /**
     * Scene changer constructor.
     * @param s A stage object that is the main stage for the application
     */
    public Scene_changer(Stage s){
        stage =s;
    }

    /**
     * Contains a login scene with an admin button
     *
     * @return
     */
    public Scene logInScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.SLATEGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
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
        Username.prefWidth(5);
        PasswordField password = new PasswordField();
        GridPane root1 = new GridPane();
        root1.addRow(0, Username);
        root1.addRow(1, password);
        root1.setAlignment(Pos.BASELINE_LEFT);
        root1.setPadding(new Insets(10, 20, 20, 10));
        root1.setAlignment(Pos.CENTER);

        Button AdminButton = new Button("Are you an Admin? Click here!!");
        AdminButton.setTranslateY(10);
        AdminButton.setTranslateX(0);


        AdminButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(AdminScene());
            }
        });

        Button RegisterButton = new Button("Don't have an account? Click here to register.");
        AdminButton.setTranslateY(70);
        AdminButton.setTranslateX(0);


        RegisterButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(RegisterScene());
            }
        });

        Button login = new Button("Enter");
        login.setTranslateY(140);
        login.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                if(Database_Access.checkUser(Username.getText(),password.getText()))
                    stage.setScene(MenuScene(name));
                else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText("Username or password is incorrect.");


                    alert.showAndWait();
                }

            }
        });


        root.getChildren().addAll(login,Username,password, userLabel, label, AdminButton, RegisterButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     * Contains the inventory of the sign database.
     *
     * @return Inventory scene
     */
    protected Scene InventoryScene() {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-230);
        menuBar.setTranslateX(-5);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label(sign());
        userLabel.setFont(new Font("Arial", 35));


        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });


        root.getChildren().addAll(userLabel);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     * Contains the report scene to allow users to report problems
     *
     * @return Report Scene
     */
    protected Scene ReportScene() {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-335);
        menuBar.setTranslateX(-5);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("Please enter your concerns below");
        userLabel.setFont(new Font("Arial", 20));

        TextField textbox = new TextField();

        Button enter = new Button("Enter");
        enter.setTranslateY(140);
        enter.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

               textbox.setText(" ");
               userLabel.setText("Thank you for your feedback");
            }
        });


        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        root.getChildren().addAll(userLabel,textbox,enter);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     *
     * @return
     */

    protected Scene EditScene() {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-375);
        menuBar.setTranslateX(-5);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("What Reservation would you like to edit?");
        userLabel.setFont(new Font("Arial", 15));


        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        root.getChildren().addAll(userLabel);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     * Contains a reserve scene that allows customers to reserve signs
     * @return
     */
    protected Scene ReserveScene() {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-355);
        menuBar.setTranslateX(-5);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("Hello");
        userLabel.setFont(new Font("Arial", 15));

        Button EditButton = new Button("Edit Previous Reservation");
        EditButton.setTranslateY(100);
        EditButton.setTranslateX(-200);


        EditButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(EditScene());
            }
        });


        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });


        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        root.getChildren().addAll(userLabel,EditButton);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     * Contains
     * @return
     */
    protected Scene RemoveScene() {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        MenuItem m6 = new MenuItem("Remove order");
        menu1.getItems().add(m6);
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(0);
        menuBar.setTranslateX(0);
        menuBar.autosize();

//        VBox root = new VBox(menuBar);
//        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
//        root.setAlignment(Pos.CENTER);
//        root.setPadding(new Insets(10, 0, 0, 10));
//        root.setSpacing(10);
//        root.setAlignment(Pos.CENTER);
//        Label userLabel = new Label("Hello");
//        userLabel.setFont(new Font("Arial", 15));
        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("");
        userLabel.setFont(new Font("Arial", 15));
        root.getChildren().addAll(userLabel);
        Label nameName=new Label("What name is your order under?");

        TextField tf1=new TextField();

        Button b = new Button("Submit");
        // This Dialog Box needs to go into the Database Access method but it's here until I find a way to refactor
//        if(tf1.getText().isEmpty() || tf2.getText().isEmpty()){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Empty Fields!");
//            alert.setHeaderText("Be sure to actually type something instead of trying to break our data base :^)");
//            alert.setContentText("Appreciated!");
//            alert.showAndWait();
//        }
        b.setOnAction(e-> removeFromDatabase(tf1.getText()));
        GridPane root1 = new GridPane();
        root1.addRow(0, nameName, tf1);
        root1.addRow(2, b);
        root1.setAlignment(Pos.BASELINE_LEFT);
        root1.setPadding(new Insets(10, 20, 20, 10));
        root1.setAlignment(Pos.CENTER_LEFT);
        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene("sfds"));
            }
        });
//        return new Scene(root1, screenBounds.getWidth(), screenBounds.getHeight());


        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }

        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });


        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        m6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(RemoveScene());
            }
        });
        root1.getChildren().addAll(userLabel,menuBar);
        return new Scene(root1, screenBounds.getWidth(), screenBounds.getHeight());
    }



    /**
     *
     *
     * @return
     */
    protected Scene AddScene() {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        MenuItem m6 = new MenuItem("Remove order");
        menu1.getItems().add(m6);
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-300);
        menuBar.setTranslateX(0);
        menuBar.autosize();

//        VBox root = new VBox(menuBar);
//        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
//        root.setAlignment(Pos.CENTER);
//        root.setPadding(new Insets(10, 0, 0, 10));
//        root.setSpacing(10);
//        root.setAlignment(Pos.CENTER);
//        Label userLabel = new Label("Hello");
//        userLabel.setFont(new Font("Arial", 15));
        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("");
        userLabel.setFont(new Font("Arial", 15));
        root.getChildren().addAll(userLabel);
        Label nameName=new Label("What's the Name of your Company/Organization?");
        Label isActive = new Label("Are you active? 1 for Yes, 0 for No");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        Button b = new Button("Submit");
        // This Dialog Box needs to go into the Database Access method but it's here until I find a way to refactor
        if(tf1.getText().isEmpty() || tf2.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields!");
            alert.setHeaderText("Be sure to actually type something instead of trying to break our data base :^)");
            alert.setContentText("Appreciated!");
            alert.showAndWait();
        }
        b.setOnAction(e-> addToDataBase(tf1.getText(),tf2.getText()));
        GridPane root1 = new GridPane();
        root1.addRow(0, nameName, tf1);
        root1.addRow(1, isActive, tf2);
        root1.addRow(2, b);
        root1.setAlignment(Pos.BASELINE_LEFT);
        root1.setPadding(new Insets(10, 20, 20, 10));
        root1.setAlignment(Pos.CENTER_LEFT);
        Button BackButton = new Button("Back to Main Menu");
        BackButton.setTranslateY(100);
        BackButton.setTranslateX(-100);


        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(MenuScene("dsfds"));
            }
        });
//        return new Scene(root1, screenBounds.getWidth(), screenBounds.getHeight());


        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }

        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });


        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });
        m6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(RemoveScene());
            }
        });

        root1.getChildren().addAll(userLabel,menuBar);
        return new Scene(root1, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     *
     *
     * @return
     */

    protected Scene RegisterScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        Label userLabel = new Label("Enter desired username and password.");
        userLabel.setFont(new Font("Arial", 15));
        TextField Username = new TextField();
        Username.prefWidth(5);
        PasswordField password = new PasswordField();
        GridPane root1 = new GridPane();
        root1.addRow(0, Username);
        root1.addRow(1, password);
        root1.setAlignment(Pos.BASELINE_LEFT);
        root1.setPadding(new Insets(10, 20, 20, 10));
        root1.setAlignment(Pos.CENTER);

        Button login = new Button("Enter");
        login.setTranslateY(140);
        login.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                String retString = Database_Access.checkNewUser(Username.getText(),password.getText());
                if(retString.equals("Success!")) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText("Success! Account created.");


                    alert.showAndWait();
                    stage.setScene(MenuScene(name));
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText(retString);


                    alert.showAndWait();
                }

            }
        });

        root.getChildren().addAll(userLabel,Username,password,login);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    protected Scene AdminScene() {
        Menu menu1 = new Menu("Admin Actions");
        Menu menu2 = new Menu("Manage Users");
        MenuItem me2 = new MenuItem("Change User Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("Manage Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-400);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        Label welcome = new Label("Welcome"+ name + "!" +" What would you like to do today?");
        welcome.setFont(new Font("Arial", 30));
        welcome.setTranslateY(-350);

        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(Change_User());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });


        root.getChildren().addAll(welcome);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }

    /**
     *
     * @return
     */
    protected Scene Change_User(){

        Menu menu1 = new Menu("Admin Actions");
        Menu menu2 = new Menu("Manage Users");
        MenuItem me2 = new MenuItem("Change User Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("Manage Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-320);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label("Please enter the new user name and new password of the user");
        userLabel.setFont(new Font("Arial", 30));
        userLabel.setTranslateY(-200);

        TextField User = new TextField();
        TextField pass = new TextField();

        Button ChangeButton = new Button("Change User Login");
        ChangeButton.setTranslateY(200);
        ChangeButton.setTranslateX(-10);

        ChangeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
               String name = User.getText();
                userLabel.setText("Login information has been sent to " + name + "@CIM.com");
                User.setText(" ");
                pass.setText(" ");
            }
        });

        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(Change_User());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        root.getChildren().addAll(ChangeButton, userLabel, User, pass);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());


    }

    /**
     *
     *
     * @param name
     * @return
     */
    protected Scene MenuScene(String name) {
        Menu menu1 = new Menu("Actions");
        Menu menu2 = new Menu("Account Settings");
        MenuItem me1 = new MenuItem("Change Password");
        MenuItem me2 = new MenuItem("Change Account Settings");
        MenuItem me3 = new MenuItem("Log out");
        MenuItem m1 = new MenuItem("See Inventory");
        MenuItem m2 = new MenuItem("Add Signs");
        MenuItem m3 = new MenuItem("Reserve Signs");
        MenuItem m5 = new MenuItem("Report a Problem");
        menu2.getItems().add(me1);
        menu2.getItems().add(me2);
        menu2.getItems().add(me3);
        menu1.getItems().add(m1);
        menu1.getItems().add(m2);
        menu1.getItems().add(m3);
        menu1.getItems().add(m5);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.setTranslateY(-400);
        menuBar.autosize();

        VBox root = new VBox(menuBar);
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        Label welcome = new Label("Welcome"+ name + "!" +" What would you like to do today?");
        welcome.setFont(new Font("Arial", 30));
        welcome.setTranslateY(-350);

        m1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {

                stage.setScene(InventoryScene());

            }
        });

        m2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                stage.setScene(AddScene());
            }
        });

        m3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReserveScene());
            }
        });

        m5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(ReportScene());
            }
        });

        me1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });

        me3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.setScene(logInScene());
            }
        });


        root.getChildren().addAll(welcome);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }


}
