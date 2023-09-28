package aula06.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        Optional<User> searchedUser = db.getByLogin("login 3");
        printUserLogin(searchedUser);
    }

    public static void printUserLogin(Optional<User> user) {
        if (user.isPresent()) {
            System.out.println(user.get().getLogin());
        } else {
            System.out.println("User not found.");
        }
    }
}
