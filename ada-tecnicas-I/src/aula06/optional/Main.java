package aula06.optional;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        User searchedUser = db.getByLogin("login 3");
        printUserLogin(searchedUser);
    }

    public static void printUserLogin(User user) {
        if (user != null) {
            System.out.println(user.getLogin());
        } else {
            System.out.println("User not found.");
        }
    }
}
