import java.util.regex.Pattern;

public class User extends Exception {

    private String login;
    private String password;
    private String confirmPassword;

    public static void checkUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!stringCorrect(login)) {
        throw new WrongLoginException("Логин неверный");}
        if (stringCorrect(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны верно");
        } else {
            throw new WrongPasswordException("Пароль неверный");
        }
    }

    private static boolean stringCorrect(String checkString) {
        if (checkString == null
                || checkString.isBlank()
                || checkString.isEmpty()
                || checkString.length() > 20) {
            return false;
        }
        return Pattern.matches("[a-zA-Z0-9_]*$", checkString);
    }

    public static void validateLogin() {

    }

    public static void validatePassword() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
