package src.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.*;

public class SignUp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/SignUp.fxml"));
            Parent root = loader.load();

            // Tạo Scene từ root
            Scene scene = new Scene(root);

            primaryStage.getIcons().add(new Image("/src/assets/img/student-management-icon.png"));


            // Thiết lập tiêu đề và cảnh của Stage
            primaryStage.setTitle("Sign Up - JavaFX Application");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args); // Khởi chạy ứng dụng
    }
}
