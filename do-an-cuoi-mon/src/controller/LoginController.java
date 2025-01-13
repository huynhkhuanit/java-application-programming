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

// Common class
import src.util.*;

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

        if (email.isEmpty() || password.isEmpty()) {
            NotificationUtils.showWarning("Lỗi đăng nhập", "Vui lòng nhập đầy đủ email và mật khẩu!");
            return;
        }

        if (!isValidEmail(email)) {
            NotificationUtils.showWarning("Lỗi đăng nhập", "Định dạng email không hợp lệ!");
            return;
        }

        if (email.equals(GlobalVariables.DEFAULT_EMAIL) && password.equals(GlobalVariables.DEFAULT_PASSWORD)) {
            NotificationUtils.showInfo("Đăng nhập thành công", "Chào mừng bạn quay lại!");
        } else {
            NotificationUtils.showError("Đăng nhập không thành không", "Email hoặc mật khẩu không đúng!");
        }
    }

    /**
     * Xử lý sự kiện khi nhấn nút Sign Up
     */
    private void handleSignUp() {
        Stage currentStage = (Stage) signUpButton.getScene().getWindow();
        loadwindowsUtils.loadWindow(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_SIGNUP, GlobalVariables.SIGNUP_NAME,
                currentStage);
    }

    /**
     * Kiểm tra định dạng email hợp lệ
     *
     * @param email Email cần kiểm tra
     * @return true nếu email hợp lệ, ngược lại false
     */
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return email.matches(emailRegex);
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
        isPasswordVisible = PasswordUtils.togglePasswordVisibility(isPasswordVisible, passwordField, visiblePasswordField, togglePasswordButton);
    }    
}
