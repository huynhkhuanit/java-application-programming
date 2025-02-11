package src.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import src.util.GlobalVariables;
import src.util.NavigationUtils;
import src.util.NotificationUtils;
import src.util.ThemeUtils;

public class MainController {

    // Khai báo thuộc tính
    @FXML
    private Button signUpButton; // Declare signUpButton fx:id

    @FXML
    private Button loginButton; // Declare loginButton fx:id

    @FXML
    private StackPane mainContent; // Declare mainContent fx:id

    @FXML
    private Button themeToggleButton; // Declare themeToggleButton fx:id

    // Login Handle event
    @FXML
    private Label welcomeLabel; // Declare welcomeLabel fx:id

    @FXML
    private Button logoutButton; // Declare logoutButton fx:id

    @FXML
    private ImageView loginAvatar; // Declare loginAvatar fx:id
    // end show info login handle event
    
    // Phương thức initialize() để khởi tạo các Action
    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> showLoginModal());
        signUpButton.setOnAction(event -> showSignupModal());

        // Thêm ThemeToggleButton vào giao diện
        updateThemeToggleButton(); // Change theme
    }

    // Click
    @FXML
    private void toggleTheme() {
        Stage stage = (Stage) themeToggleButton.getScene().getWindow();
        Scene scene = stage.getScene();

        // Chuyển đổi giao diện
        ThemeUtils.toggleTheme(scene);

        // Cập nhật nhãn cho nút
        updateThemeToggleButton();
    }

    // Update theme
    private void updateThemeToggleButton() {
        if (ThemeUtils.isDarkTheme()) {
            themeToggleButton.setText("🌙");
            themeToggleButton.setStyle("-fx-background-color: #fff; -fx-text-fill: #000; -fx-background-radius: 15;");
        } else {
            themeToggleButton.setText("🌞");
            themeToggleButton
                    .setStyle("-fx-background-color: #04aa6d; -fx-text-fill: white; -fx-background-radius: 15;");
        }
    }

    // Login success -> call by MainController in LoginController
    public void handleLoginSuccess(String username) {
        // Hiển thị thông báo chào mừng
        welcomeLabel.setText("Chào mừng, " + username + "!");
        welcomeLabel.setVisible(true);

        // Hiển thị nút Đăng xuất
        logoutButton.setVisible(true);

        // Hiển thị ảnh
        Image tempImage = new Image(GlobalVariables.BASE_IMAGE_PATH + "user.png");
        loginAvatar.setImage(tempImage);

        // Ẩn các nút Đăng nhập và Đăng ký
        loginButton.setVisible(false);
        signUpButton.setVisible(false);

        // Xử lý sự kiện nút Đăng xuất
        logoutButton.setOnAction(event -> handleLogout());
    }

    // Xu ly dang xuat
    private void handleLogout() {
        // Ẩn thông báo chào mừng và nút Đăng xuất
        welcomeLabel.setText("VUI LÒNG ĐĂNG NHẬP");
        ;
        logoutButton.setVisible(false);
        Image tempImage = new Image(GlobalVariables.BASE_IMAGE_PATH + "warning.png");
        loginAvatar.setImage(tempImage);

        // Hiển thị lại các nút Đăng nhập và Đăng ký
        loginButton.setVisible(true);
        signUpButton.setVisible(true);

        // Xóa thông tin người dùng (nếu cần)
        NotificationUtils.showInfo("ĐĂNG XUẤT", "Bạn đã đăng xuất!");
    }

    // Click vào onAction của #showDashboard sẽ gọi phương thức nằm trong
    // NavigationUtils.switchScreen từ util
    @FXML
    private void showDashboard() {
        NavigationUtils.switchScreen(mainContent, GlobalVariables.BASE_FXML_PATH + "dashboard.fxml");
    }

    @FXML
    private void showStudentManagement() {
        System.out.println("Chức năng Quản lý Sinh viên được kích hoạt.");
        mainContent.getChildren().clear();
        // Thêm logic chuyển đổi màn hình hoặc chức năng cần thiết
    }

    @FXML
    private void showCourseManagement() {
        System.out.println("Chức năng Quản lý khoá học được kích hoạt.");
        mainContent.getChildren().clear();
        // Thêm logic chuyển đổi màn hình hoặc chức năng cần thiết
    }

    @FXML
    private void showLecturerManagement() {
        System.out.println("Chức năng Quản lý giảng viên được kích hoạt.");
        mainContent.getChildren().clear();
        // Thêm logic chuyển đổi màn hình hoặc chức năng cần thiết
    }

    @FXML
    private void showStatistics() {
        System.out.println("Chức năng thống kê được kích hoạt.");
        mainContent.getChildren().clear();
        // Thêm logic chuyển đổi màn hình hoặc chức năng cần thiết
    }

    // Show login modal
    private void showLoginModal() {
        try {
            // Load FXML cho login
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_LOGIN));
            Parent root = loader.load();

            // Tạo Stage (modal) cho login
            Stage loginStage = new Stage();
            loginStage.setTitle("Đăng Nhập");

            loginStage.getIcons().add(new Image(getClass()
                    .getResource(GlobalVariables.BASE_IMAGE_PATH + "student-management-icon.png").toExternalForm()));

            // Truyền MainController vào Stage qua setUserData
            loginStage.setUserData(this); // Truyền đối tượng MainController vào Stage

            loginStage.setScene(new Scene(root));
            loginStage.initModality(Modality.APPLICATION_MODAL); // Chặn giao diện chính khi mở modal
            loginStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Handle action showSignupModal
    private void showSignupModal() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(GlobalVariables.BASE_FXML_PATH + GlobalVariables.APP_NAME_SIGNUP));
            Parent root = loader.load();

            Stage signupStage = new Stage();
            signupStage.setTitle("Đăng Ký");
            signupStage.getIcons().add(new Image(getClass()
                    .getResource(GlobalVariables.BASE_IMAGE_PATH + "student-management-icon.png").toExternalForm()));

            signupStage.setUserData(this);
            signupStage.setScene(new Scene(root));
            signupStage.initModality(Modality.APPLICATION_MODAL); // Chặn giao diện chính khi mở modal
            signupStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
