package src.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image; // Import Images

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/src/view/Main.fxml"));
        primaryStage.setTitle("Đồ Án Cuối Môn - Lập Trình Java");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // Application icon
        primaryStage.getIcons().add(new Image("/src/assets/img/student-management-icon.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
