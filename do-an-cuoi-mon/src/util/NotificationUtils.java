package src.util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.*;

public class NotificationUtils {

    private static final String INFO_ICON_PATH = GlobalVariables.BASE_IMAGE_PATH + "caution.png";
    private static final String WARNING_ICON_PATH = GlobalVariables.BASE_IMAGE_PATH + "warning.png";
    private static final String ERROR_ICON_PATH = GlobalVariables.BASE_IMAGE_PATH + "error.png";
    private static final String CONFIRMATION_ICON_PATH = GlobalVariables.BASE_IMAGE_PATH + "confirmation.png";

    /**
     * Hiển thị thông báo thông tin.
     * 
     * @param title   Tiêu đề của thông báo.
     * @param message Nội dung của thông báo.
     */
    public static void showInfo(String title, String message) {
        showAlert(Alert.AlertType.INFORMATION, title, message);
    }

    /**
     * Hiển thị thông báo cảnh báo.
     * 
     * @param title   Tiêu đề của thông báo.
     * @param message Nội dung của thông báo.
     */
    public static void showWarning(String title, String message) {
        showAlert(Alert.AlertType.WARNING, title, message);
    }

    /**
     * Hiển thị thông báo lỗi.
     * 
     * @param title   Tiêu đề của thông báo.
     * @param message Nội dung của thông báo.
     */
    public static void showError(String title, String message) {
        showAlert(Alert.AlertType.ERROR, title, message);
    }

    /**
     * Hiển thị thông báo xác nhận với người dùng.
     * 
     * @param title   Tiêu đề của thông báo.
     * @param message Nội dung của thông báo.
     * @return true nếu người dùng xác nhận, ngược lại false.
     */
    public static boolean showConfirmation(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
    
        // Gắn icon xác nhận
        setAppIcon(alert, Alert.AlertType.CONFIRMATION);
    
        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get() == ButtonType.OK;
    }

    /**
     * Hiển thị thông báo chung.
     * 
     * @param alertType Loại thông báo (INFORMATION, WARNING, ERROR, CONFIRMATION).
     * @param title     Tiêu đề của thông báo.
     * @param message   Nội dung của thông báo.
     */
    private static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
    
        // Gắn icon theo loại thông báo
        setAppIcon(alert, alertType);
    
        alert.showAndWait();
    }

    /**
     * Gắn icon ứng dụng vào thông báo.
     * 
     * @param alert Thông báo cần gắn icon.
     */
    private static void setAppIcon(Alert alert, Alert.AlertType alertType) {
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        String iconPath = "";
    
        // Chọn icon theo loại thông báo
        switch (alertType) {
            case INFORMATION:
                iconPath = INFO_ICON_PATH;
                break;
            case WARNING:
                iconPath = WARNING_ICON_PATH;
                break;
            case ERROR:
                iconPath = ERROR_ICON_PATH;
                break;
            case CONFIRMATION:
                iconPath = CONFIRMATION_ICON_PATH;
                break;
        }
    
        // Gắn icon
        stage.getIcons().add(new Image(NotificationUtils.class.getResource(iconPath).toExternalForm()));
    }
}
