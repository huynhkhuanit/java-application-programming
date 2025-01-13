package src.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class NavigationUtils {

    /**
     * Chuyển đổi màn hình trong StackPane.
     *
     * @param stackPane  StackPane chứa các màn hình.
     * @param fxmlPath   Đường dẫn file FXML của màn hình cần chuyển đổi.
     */
    public static void switchScreen(StackPane mainContent, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(NavigationUtils.class.getResource(fxmlPath));
            Parent root = loader.load();
    
            mainContent.getChildren().clear();
            mainContent.getChildren().add(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

    /**
     * Mở một màn hình mới dưới dạng Scene chính.
     *
     * @param stage     Stage hiện tại.
     * @param fxmlPath  Đường dẫn file FXML.
     * @param title     Tiêu đề của màn hình.
     */
    public static void openNewScene(Stage stage, String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(NavigationUtils.class.getResource(fxmlPath));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Mở một màn hình dưới dạng Modal.
     *
     * @param fxmlPath  Đường dẫn file FXML.
     * @param title     Tiêu đề của Modal.
     * @param iconPath  Đường dẫn icon của Modal (có thể null).
     */
    public static void openModal(String fxmlPath, String title, String iconPath) {
        try {
            FXMLLoader loader = new FXMLLoader(NavigationUtils.class.getResource(fxmlPath));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));

            if (iconPath != null) {
                stage.getIcons().add(new javafx.scene.image.Image(NavigationUtils.class.getResource(iconPath).toExternalForm()));
            }

            stage.initModality(Modality.APPLICATION_MODAL); // Đặt là Modal
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
