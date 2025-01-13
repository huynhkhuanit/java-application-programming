package src.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import src.util.GlobalVariables;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_MAIN));

        // root -> Nhánh chính gọi load
        Parent root = loader.load();
        Scene scene = new Scene(root);

        // Title
        primaryStage.setTitle(GlobalVariables.APP_NAME);

        // Icon
        primaryStage.getIcons()
                .add(new Image(getClass().getResource(GlobalVariables.BASE_IMAGE_PATH + "student-management-icon.png").toExternalForm()));        

        // Tạo Scene
        primaryStage.setScene(scene);

        // Show Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
