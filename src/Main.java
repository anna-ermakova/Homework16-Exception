public class Main {
    public static void main(String[] args) {

        try {
            User.checkUser("eva_GREEN", "123456abc", "123456abc");
            User.checkUser("anna", "654321", "654321");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Проверьте правильность введенных данных");
            e.printStackTrace();
        } finally {
            System.out.println("______________________");

        }

    }
}