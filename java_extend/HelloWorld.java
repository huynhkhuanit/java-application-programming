package java_extend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Tạo một label để hiển thị "Hello, World!"
        Label label = new Label("Hello, World!");

        // Tạo layout và thêm label vào
        StackPane layout = new StackPane();
        layout.getChildren().add(label);

        // Tạo scene với layout
        Scene scene = new Scene(layout, 300, 200);

        // Thiết lập cửa sổ chính (stage)
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Khởi chạy ứng dụng JavaFX
        launch(args);
    }
}
