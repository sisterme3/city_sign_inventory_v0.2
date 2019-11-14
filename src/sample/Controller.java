package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Window;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    private Button ContinueButton;

    @FXML
    private Button ForgetButton;


    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Window owner = submitButton.getScene().getWindow();
        if(nameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your username");
            return;
        }

        if(passwordField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter a password");
            return;
        }

        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + nameField.getText());


    }

    @FXML
    protected void handleContinue(ActionEvent event) {
        Window owner = ContinueButton.getScene().getWindow();

        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + nameField.getText());
    }

@FXML
    protected void handleforget(ActionEvent event){
        Window owner1 = ForgetButton.getScene().getWindow();

        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner1, "helllo",
            "Welcome " + nameField.getText());
}
}
