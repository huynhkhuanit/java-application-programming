package src.controller;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class SignUpController {
    @FXML
    private TextField fullNameField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private Button signUpButton;

    @FXML
    private Label descriptionLabel;

    @FXML
    public void initialize() {
        applyFadeEffect(descriptionLabel);
        applyScaleEffect(descriptionLabel);
    }

    private void applyFadeEffect(Node node) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(2000));
        fade.setFromValue(0.0);
        fade.setToValue(1.0);
        fade.setNode(node);
        fade.play();
    }

    private void applyScaleEffect(Node node) {
        ScaleTransition scale = new ScaleTransition(Duration.millis(500), node);
        scale.setFromX(1.0);
        scale.setFromY(1.0);
        scale.setToX(1.2);
        scale.setToY(1.2);

        node.setOnMouseEntered(event -> scale.playFromStart());
        node.setOnMouseExited(event -> {
            scale.setRate(-1);
            scale.play();
        });
    }

    @FXML
    private void handleSignUpButtonClick() {
        String fullName = fullNameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match!");
            return;
        }

        System.out.println("User Signed Up Successfully!");
        System.out.println("Name: " + fullName + ", Email: " + email);
    }
}
