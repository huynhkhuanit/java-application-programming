package src.util;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class PasswordUtils {

    /**
     * Chuyển đổi trạng thái ẩn/hiện mật khẩu
     *
     * @param isPasswordVisible  Trạng thái hiện tại của mật khẩu
     * @param passwordField      Trường mật khẩu dạng ẩn
     * @param visiblePasswordField Trường mật khẩu dạng hiện
     * @param toggleButton       Nút toggle
     * @return Trạng thái mới của mật khẩu
     */
    public static boolean togglePasswordVisibility(boolean isPasswordVisible, PasswordField passwordField,
                                                   TextField visiblePasswordField, Button toggleButton) {
        if (isPasswordVisible) {
            // Hiển thị PasswordField, ẩn TextField
            passwordField.setVisible(true);
            passwordField.setManaged(true);

            visiblePasswordField.setVisible(false);
            visiblePasswordField.setManaged(false);

            // Cập nhật icon con mắt
            toggleButton.setText("👁");
        } else {
            // Hiển thị TextField, ẩn PasswordField
            visiblePasswordField.setText(passwordField.getText());
            visiblePasswordField.setVisible(true);
            visiblePasswordField.setManaged(true);

            passwordField.setVisible(false);
            passwordField.setManaged(false);

            // Cập nhật icon con mắt
            toggleButton.setText("🔒");
        }
        return !isPasswordVisible;
    }
}
