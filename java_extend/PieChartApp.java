package java_extend;

public class PieChartApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        PieChart pieChart = new PieChart();
        pieChart.getData().addAll(
                new PieChart.Data("Java", 40),
                new PieChart.Data("Python", 30),
                new PieChart.Data("C++", 20),
                new PieChart.Data("Others", 10));

        StackPane layout = new StackPane(pieChart);
        Scene scene = new Scene(layout, 400, 400);

        primaryStage.setTitle("Programming Language Usage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
