package src.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    // Khai báo thuộc tính
    @FXML
    private Button signUpButton;

    @FXML
    private Button loginButton;

    // Phương thức initialize() để khởi tạo các Action
    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> showLoginModal());
        signUpButton.setOnAction(event -> showSignupModal());
    }

    // Handle action showLoginModal
    private void showLoginModal() {
        try {
            // Load FXML cho login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/login.fxml"));
            Parent root = loader.load();


            // Tạo Stage (modal) cho login
            Stage loginStage = new Stage();
            loginStage.setTitle("Đăng Nhập");

            loginStage.getIcons().add(new Image(getClass().getResource("/src/assets/img/student-management-icon.png").toExternalForm()));
            
            
            loginStage.setScene(new Scene(root));
            loginStage.initModality(Modality.APPLICATION_MODAL); // Chặn giao diện chính khi mở modal
            loginStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Handle action showSignupModal
    private void showSignupModal() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/signup.fxml"));
            Parent root = loader.load();

            Stage signupStage = new Stage();
            signupStage.setTitle("Đăng Ký");
            signupStage.getIcons().add(new Image(getClass().getResource("/src/assets/img/student-management-icon.png").toExternalForm()));
            signupStage.setScene(new Scene(root));
            signupStage.initModality(Modality.APPLICATION_MODAL); // Chặn giao diện chính khi mở modal
            signupStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Next Action...
}
