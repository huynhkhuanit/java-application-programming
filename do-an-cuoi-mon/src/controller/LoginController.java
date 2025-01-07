package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    // Khai báo thuộc tính
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> handleLogin());
        signUpButton.setOnAction(event -> handleSignUp());
    }

    /**
     * Xử lý sự kiện khi nhấn nút Login
     */
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            showAlert(AlertType.ERROR, "Lỗi đăng nhập", "Vui lòng nhập đầy đủ email và mật khẩu!");
            return;
        }

        if (!isValidEmail(email)) {
            showAlert(AlertType.ERROR, "Lỗi đăng nhập", "Định dạng email không hợp lệ!");
            return;
        }

        if (email.equals("user@example.com") && password.equals("password")) {
            showAlert(AlertType.INFORMATION, "Đăng nhập thành công", "Chào mừng bạn quay lại!");
        } else {
            showAlert(AlertType.ERROR, "Lỗi đăng nhập", "Email hoặc mật khẩu không đúng!");
        }
    }

    /**
     * Xử lý sự kiện khi nhấn nút Sign Up
     */
    private void handleSignUp() {
        // Điều hướng tới giao diện đăng ký (nếu có)
        System.out.println("Điều hướng tới giao diện đăng ký...");
    }

    /**
     * Hiển thị thông báo (Alert)
     *
     * @param alertType Loại thông báo (ERROR, INFORMATION, WARNING, ...)
     * @param title     Tiêu đề thông báo
     * @param message   Nội dung thông báo
     */
    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Kiểm tra định dạng email
     *
     * @param email Email cần kiểm tra
     * @return true nếu email hợp lệ, ngược lại false
     */
    private boolean isValidEmail(String email) {
        // Sử dụng regex để kiểm tra định dạng email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return email.matches(emailRegex);
    }
}
