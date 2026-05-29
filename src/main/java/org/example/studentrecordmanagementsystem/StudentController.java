package org.example.studentrecordmanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StudentController {
    @FXML private TextField nameField;
    @FXML private TextField emailField;

    private Controller dbController = new Controller();

    @FXML
    protected void onSaveButtonClick() {

        dbController.addStudent(nameField.getText(), emailField.getText());
    }
}