package org.example.studentrecordmanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML private TextField nameField;
    @FXML private TextField emailField;

    private Controller dbController = new Controller();

    @FXML
    protected void onSaveButtonClick() {
        String name  = nameField.getText();
        String email = emailField.getText();

        if (name.isEmpty() || email.isEmpty()) {
            showAlert("Please fill in both fields.");
            return;
        }

        dbController.addStudent(name, email);
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}