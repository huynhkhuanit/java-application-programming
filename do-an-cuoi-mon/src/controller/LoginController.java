package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.awt.Toolkit;
import java.sql.Connection;

// Common class
import src.util.*;
import src.model.*;

public class LoginController {

    // Thuộc tính kết nối với FXML
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField visiblePasswordField;

    @FXML
    private Button togglePasswordButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    private Label capsLockWarning; // Label hiển thị thông báo Caps Lock

    // Kiểm tra Caps Lock
    private boolean isCapsLockOn;

    // Trạng thái ẩn hiện password.
    private boolean isPasswordVisible = false;

    @FXML
    public void initialize() {
        // Kiểm tra trạng thái Caps Lock khi khởi động
        isCapsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(java.awt.event.KeyEvent.VK_CAPS_LOCK);
        capsLockWarning.setVisible(isCapsLockOn);

        // Gắn sự kiện cho các nút
        loginButton.setOnAction(event -> handleLogin());
        signUpButton.setOnAction(event -> handleSignUp());

        // Lắng nghe sự kiện trên passwordField
        passwordField.setOnKeyReleased(this::checkCapsLock);
        passwordField.setOnMouseClicked(event -> {
            // Kiểm tra lại Caps Lock khi passwordField được nhấn vào
            isCapsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(java.awt.event.KeyEvent.VK_CAPS_LOCK);
            capsLockWarning.setVisible(isCapsLockOn);
        });

        // Password visible
        passwordField.textProperty().addListener((obs, oldText, newText) -> visiblePasswordField.setText(newText));
        visiblePasswordField.textProperty().addListener((obs, oldText, newText) -> passwordField.setText(newText));

        togglePasswordButton.setOnAction(event -> togglePasswordVisibility());
    }

    
    /**
     * Xử lý sự kiện khi nhấn nút Login
     */
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();
    
        // Kiểm tra thông tin đăng nhập từ cơ sở dữ liệu
        User user = UserService.authenticate(email, password);
        if (user != null) {
            NotificationUtils.showInfo("Đăng nhập thành công", "Chào mừng bạn quay lại!");
    
            // Lấy Stage hiện tại
            Stage currentStage = (Stage) loginButton.getScene().getWindow();
    
            // Lấy MainController từ Stage chính (đã được truyền vào trong showLoginModal)
            MainController mainController = (MainController) currentStage.getUserData();
            if (mainController != null) {
                mainController.handleLoginSuccess(user.getUsername());
            } else {
                System.out.println("MainController là null, không thể xử lý đăng nhập.");
            }
    
            // Đóng cửa sổ đăng nhập
            currentStage.close();
        } else {
            NotificationUtils.showError("Đăng nhập thất bại", "Email hoặc mật khẩu không chính xác!");
        }
    }
    

    /**
     * Xử lý sự kiện khi nhấn nút Sign Up
     */
    private void handleSignUp() {
        Stage currentStage = (Stage) signUpButton.getScene().getWindow();
        loadwindowsUtils.loadWindow(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_SIGNUP,
                GlobalVariables.SIGNUP_NAME,
                currentStage);
    }
    
    /**
     * Kiểm tra trạng thái Caps Lock khi nhấn phím
     *
     * @param event Sự kiện phím
     */
    private void checkCapsLock(KeyEvent event) {
        if (event.getCode().toString().equals("CAPS")) {
            // Đảo trạng thái Caps Lock khi nhấn phím Caps Lock
            isCapsLockOn = !isCapsLockOn;
        }

        // Hiển thị hoặc ẩn thông báo Caps Lock
        capsLockWarning.setVisible(isCapsLockOn);
    }

    // Ẩn hiện mật khẩu với button
    private void togglePasswordVisibility() {
        isPasswordVisible = PasswordUtils.togglePasswordVisibility(isPasswordVisible, passwordField,
                visiblePasswordField, togglePasswordButton);
    }
}
