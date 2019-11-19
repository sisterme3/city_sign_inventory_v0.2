package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;

public class Scene_changer extends Database_Access {
    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
    protected Scene InventoryScene() {
        VBox root = new VBox();
        root.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 0, 0, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        Label userLabel = new Label(sign());
        userLabel.setFont(new Font("Arial", 15));
        root.getChildren().addAll(userLabel);
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
        root.getChildren().addAll(userLabel);
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
        root.getChildren().addAll(userLabel);
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
        root.getChildren().addAll(userLabel);
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
        root.getChildren().addAll(userLabel);
        return new Scene(root, screenBounds.getWidth(), screenBounds.getHeight());
    }


}
