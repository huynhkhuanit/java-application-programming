package src.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Load FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/login.fxml"));
            Parent root = loader.load();

            // Tạo Scene từ root
            Scene scene = new Scene(root);

            // Gắn icon ứng dụng
            primaryStage.getIcons()
                    .add(new Image(getClass().getResource("/src/assets/img/student-management-icon.png").toExternalForm()));


            // Thiết lập tiêu đề và cảnh của Stage
            primaryStage.setTitle("ĐĂNG NHẬP");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
