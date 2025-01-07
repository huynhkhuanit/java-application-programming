package src.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/Main.fxml"));

        // root -> Nhánh chính gọi load
        Parent root = loader.load();

        // Title
        primaryStage.setTitle("Đồ Án Cuối Môn - Lập Trình Java");

        // Icon
        primaryStage.getIcons()
                .add(new Image(getClass().getResource("/src/assets/img/student-management-icon.png").toExternalForm()));

        // Tạo Scene
        primaryStage.setScene(new Scene(root));

        // Show Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
