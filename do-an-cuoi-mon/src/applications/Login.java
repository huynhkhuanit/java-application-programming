package src.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import src.util.GlobalVariables;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Load FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_LOGIN));
            Parent root = loader.load();

            // Tạo Scene từ root
            Scene scene = new Scene(root);

            // Gắn icon ứng dụng
            primaryStage.getIcons()
                    .add(new Image(getClass().getResource(GlobalVariables.BASE_IMAGE_PATH + "student-management-icon.png").toExternalForm()));

            scene.getStylesheets().add(getClass().getResource(GlobalVariables.BASE_CSS_PATH + "SignUp.css").toExternalForm());

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
