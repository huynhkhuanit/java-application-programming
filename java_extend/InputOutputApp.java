package java_extend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InputOutputApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Tạo các thành phần giao diện
        Label label = new Label("Nhập thông tin của bạn:");
        TextField textField = new TextField();
        Button button = new Button("Hiển thị thông tin");
        Label outputLabel = new Label();

        // Xử lý sự kiện khi nhấn nút
        button.setOnAction(e -> {
            String inputText = textField.getText();
            if (inputText.isEmpty()) {
                outputLabel.setText("Vui lòng nhập thông tin!");
            } else {
                outputLabel.setText("Thông tin bạn nhập: " + inputText);
            }
        });

        // Tạo layout và thêm các thành phần vào
        VBox layout = new VBox(10); // Khoảng cách giữa các phần tử là 10
        layout.getChildren().addAll(label, textField, button, outputLabel);

        // Tạo scene và thêm vào stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Ứng dụng nhập thông tin");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
