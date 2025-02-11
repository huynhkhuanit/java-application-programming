package src.util;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class ThemeUtils {
    private static final String LIGHT_THEME = GlobalVariables.BASE_CSS_PATH + "light.css";
    private static final String DARK_THEME = GlobalVariables.BASE_CSS_PATH + "dark.css";
    private static boolean isDarkTheme = false;

    public static void toggleTheme(Scene scene) {
        if (isDarkTheme) {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(ThemeUtils.class.getResource(LIGHT_THEME).toExternalForm());
        } else {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(ThemeUtils.class.getResource(DARK_THEME).toExternalForm());
        }
        isDarkTheme = !isDarkTheme;
    }

    public static boolean isDarkTheme() {
        return isDarkTheme;
    }
}
