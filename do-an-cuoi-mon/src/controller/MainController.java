package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
    @FXML
    private Button startButton;

    @FXML
    private void handlebutton() {
        System.out.println("Bắt đầu ứng dụng!");
    }
}
