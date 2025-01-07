package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    private Button signUpButton;

    @FXML
    private Button loginButton;

    @FXML
    public void initialize() {
        // Gắn sự kiện cho nút ĐĂNG KÝ
        signUpButton.setOnAction(event -> handleSignUp());
        // Gắn sự kiện cho nút ĐĂNG NHẬP
        loginButton.setOnAction(event -> handleLogin());
    }

    // Click đăng ký
    private void handleSignUp() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            System.out.println("Vui lòng điền đầy đủ thông tin!");
            return;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Mật khẩu không khớp!");
            return;
        }

        System.out.println("Đăng ký thành công!");
        System.out.println("Họ tên: " + username + ", Email: " + email);
    }

    // Click đăng nhập -> Chưa xử lý chuyển hướng
    private void handleLogin() {
        System.out.println("Chuyển sang giao diện ĐĂNG NHẬP!");
        // Thêm logic để chuyển giao diện tại đây
    }
}
