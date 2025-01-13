package src.util;

import javafx.animation.FadeTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class loadwindowsUtils {
    public static void loadWindow(String fxmlPath, String title, Stage currentStage) {
        try {
            FXMLLoader loader = new FXMLLoader(loadwindowsUtils.class.getResource(fxmlPath));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();

            if (currentStage != null) currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Phương thức switchScene là một [Option nâng cao] -> Nếu cần chuyển đổi màn hình mà không cần tắt để mở màn hình hay Modal mới
    public static void switchScene(Stage currentStage, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(loadwindowsUtils.class.getResource(fxmlPath));
            Parent newRoot = loader.load();

            Scene currentScene = currentStage.getScene();
            Parent oldRoot = currentScene.getRoot();

            // Fade out old scene
            FadeTransition fadeOut = new FadeTransition(Duration.millis(200), oldRoot);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);

            // Fade in new scene
            fadeOut.setOnFinished(event -> {
                currentScene.setRoot(newRoot);

                FadeTransition fadeIn = new FadeTransition(Duration.millis(200), newRoot);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();
            });

            fadeOut.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
