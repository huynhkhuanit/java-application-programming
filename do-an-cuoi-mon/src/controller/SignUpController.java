package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import src.util.*;

import java.awt.Toolkit;

public class SignUpController {

    // Khai báo thuộc tính
    @FXML
    private TextField usernameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField visiblePasswordField;

    @FXML
    private TextField visibleConfirmPasswordField;

    @FXML
    private Button togglePasswordButton;

    @FXML
    private Button toggleConfirmPasswordButton;

    @FXML
    private Button signUpButton;

    @FXML
    private Button loginButton;

    @FXML
    private Label capsLockWarning;

    // Trạng thái Caps Lock
    private boolean isCapsLockOn;

    // Trạng thái ẩn/hiện mật khẩu
    private boolean isPasswordVisible = false;
    private boolean isConfirmPasswordVisible = false;

    @FXML
    public void initialize() {
        // Kiểm tra trạng thái Caps Lock khi khởi động
        isCapsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(java.awt.event.KeyEvent.VK_CAPS_LOCK);
        capsLockWarning.setVisible(isCapsLockOn);

        // Gắn sự kiện cho nút ĐĂNG KÝ
        signUpButton.setOnAction(event -> handleSignUp());
        // Gắn sự kiện cho nút ĐĂNG NHẬP
        loginButton.setOnAction(event -> handleLogin());

        // Lắng nghe sự kiện Caps Lock trên trường mật khẩu
        passwordField.setOnKeyReleased(event -> checkCapsLock(event));
        confirmPasswordField.setOnKeyReleased(event -> checkCapsLock(event));

        // Đồng bộ hóa trường mật khẩu và hiển thị mật khẩu
        setupPasswordFieldBinding(passwordField, visiblePasswordField);
        setupPasswordFieldBinding(confirmPasswordField, visibleConfirmPasswordField);

        // Nút toggle ẩn/hiện mật khẩu
        togglePasswordButton.setOnAction(event -> togglePasswordVisibility());
        toggleConfirmPasswordButton.setOnAction(event -> toggleConfirmPasswordVisibility());
    }

    /**
     * Xử lý sự kiện khi nhấn nút ĐĂNG KÝ
     */
    private void handleSignUp() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            NotificationUtils.showWarning("Lỗi đăng ký", "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        // Gọi lớp ValidationUtils chứa phương thức isValidEmal để kiểm tra định dạng email
        if (!ValidationUtils.isValidEmail(email)) {
            NotificationUtils.showError("Lỗi", "Định dạng email không hợp lệ!");
            return;
        }

        if (!password.equals(confirmPassword)) {
            NotificationUtils.showError("Lỗi", "Mật khẩu không khớp!");
            return;
        }

        NotificationUtils.showInfo("Đăng ký thành công", "Chào mừng bạn, " + username + "!");
    }

    /**
     * Xử lý sự kiện khi nhấn nút ĐĂNG NHẬP
     */
    private void handleLogin() {
        Stage currentStage = (Stage) loginButton.getScene().getWindow();
        loadwindowsUtils.loadWindow(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_LOGIN, GlobalVariables.LOGIN_NAME, currentStage);
    }

    /**
     * Kiểm tra trạng thái Caps Lock
     */
    private void checkCapsLock(KeyEvent event) {
        if (event.getCode().toString().equals("CAPS")) {
            // Đảo trạng thái Caps Lock khi nhấn phím Caps Lock
            isCapsLockOn = !isCapsLockOn;
        }

        // Hiển thị hoặc ẩn thông báo Caps Lock
        capsLockWarning.setVisible(isCapsLockOn);
    }

    /**
     * Ẩn/Hiện mật khẩu cho trường mật khẩu chính
     */
    private void togglePasswordVisibility() {
        isPasswordVisible = !isPasswordVisible;
        togglePasswordFieldVisibility(passwordField, visiblePasswordField, togglePasswordButton, isPasswordVisible);
    }

    /**
     * Ẩn/Hiện mật khẩu cho trường xác nhận mật khẩu
     */
    private void toggleConfirmPasswordVisibility() {
        isConfirmPasswordVisible = !isConfirmPasswordVisible;
        togglePasswordFieldVisibility(confirmPasswordField, visibleConfirmPasswordField, toggleConfirmPasswordButton, isConfirmPasswordVisible);
    }

    /**
     * Đồng bộ hóa giữa trường PasswordField và TextField
     */
    private void setupPasswordFieldBinding(PasswordField passwordField, TextField visiblePasswordField) {
        passwordField.textProperty().addListener((observable, oldValue, newValue) -> visiblePasswordField.setText(newValue));
        visiblePasswordField.textProperty().addListener((observable, oldValue, newValue) -> passwordField.setText(newValue));
    }

    /**
     * Chuyển đổi giữa PasswordField và TextField
     */
    private void togglePasswordFieldVisibility(PasswordField passwordField, TextField visiblePasswordField, Button toggleButton, boolean isVisible) {
        if (isVisible) {
            visiblePasswordField.setVisible(true);
            visiblePasswordField.setManaged(true);

            passwordField.setVisible(false);
            passwordField.setManaged(false);

            toggleButton.setText("🔒");
        } else {
            passwordField.setVisible(true);
            passwordField.setManaged(true);

            visiblePasswordField.setVisible(false);
            visiblePasswordField.setManaged(false);

            toggleButton.setText("👁");
        }
    }
}
