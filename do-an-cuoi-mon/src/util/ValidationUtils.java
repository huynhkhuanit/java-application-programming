package src.util;

public class ValidationUtils {

    /**
     * Kiểm tra định dạng email hợp lệ
     *
     * @param email Email cần kiểm tra
     * @return true nếu email hợp lệ, ngược lại false
     */
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return email.matches(emailRegex);
    }
}
