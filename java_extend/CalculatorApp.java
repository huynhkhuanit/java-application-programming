package java_extend;

public class CalculatorApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField display = new TextField();
        display.setEditable(false);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            String text = buttons[i];
            Button button = new Button(text);
            button.setPrefWidth(50);

            int col = i % 4;
            int row = i / 4;

            button.setOnAction(e -> {
                if ("=".equals(text)) {
                    // Simple evaluation logic (not robust)
                    display.setText("Result!");
                } else {
                    display.appendText(text);
                }
            });

            gridPane.add(button, col, row + 1);
        }

        gridPane.add(display, 0, 0, 4, 1);

        Scene scene = new Scene(gridPane, 250, 300);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
