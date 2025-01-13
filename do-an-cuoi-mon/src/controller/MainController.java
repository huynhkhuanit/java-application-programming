package src.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import src.util.GlobalVariables;
import src.util.NavigationUtils;

public class MainController {

    // Khai báo thuộc tính
    @FXML
    private Button signUpButton;

    @FXML
    private Button loginButton;

    @FXML
    private StackPane mainContent;

    // Phương thức initialize() để khởi tạo các Action
    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> showLoginModal());
        signUpButton.setOnAction(event -> showSignupModal());
    }

    // Click vào onAction của #showDashboard sẽ gọi phương thức nằm trong NavigationUtils.switchScreen từ util
    @FXML
    private void showDashboard() {
        NavigationUtils.switchScreen(mainContent, GlobalVariables.BASE_FXML_PATH + "dashboard.fxml");
    }

    @FXML
    private void showUIElements() {
        mainContent.getChildren().clear();
        // NavigationUtils.switchScreen(mainContent, GlobalVariables.BASE_FXML_PATH + "dashboard.fxml");
    }

    // Handle action showLoginModal
    private void showLoginModal() {
        try {
            // Load FXML cho login
            FXMLLoader loader = new FXMLLoader(getClass().getResource(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_LOGIN));
            Parent root = loader.load();

            // Tạo Stage (modal) cho login
            Stage loginStage = new Stage();
            loginStage.setTitle("Đăng Nhập");

            loginStage.getIcons().add(new Image(getClass()
                    .getResource(GlobalVariables.BASE_IMAGE_PATH + "student-management-icon.png").toExternalForm()));

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_SIGNUP));
            Parent root = loader.load();

            Stage signupStage = new Stage();
            signupStage.setTitle("Đăng Ký");
            signupStage.getIcons().add(new Image(getClass()
                    .getResource(GlobalVariables.BASE_IMAGE_PATH + "student-management-icon.png").toExternalForm()));
            signupStage.setScene(new Scene(root));
            signupStage.initModality(Modality.APPLICATION_MODAL); // Chặn giao diện chính khi mở modal
            signupStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
