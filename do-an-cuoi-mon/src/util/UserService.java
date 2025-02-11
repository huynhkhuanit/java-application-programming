package src.util;
import src.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    public static User authenticate(String email, String password) {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?"; // choose users table
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, PasswordUtils.hashPassword(password));
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new User(
                    resultSet.getString("username"),
                    resultSet.getString("email"),
                    resultSet.getString("role")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
