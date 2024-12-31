package java_extend;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainController {
    @FXML
    private Button myButton;

    @FXML
    private Button button2;

    @FXML
    private TextArea myTextField;

    @FXML
    private void handleButtonClick() {
        // Lấy nội dung từ TextArea
        String userInput = myTextField.getText();

        // Hiển thị thông báo
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Thông Báo");
        alert.setHeaderText("Bạn đã nhập:");
        alert.setContentText(userInput);
        alert.showAndWait();
    }

    @FXML
    private void handleButtonClick2() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Thông Báo");
        alert.setContentText("Ban click nut 2");
        alert.showAndWait();
    }
}
