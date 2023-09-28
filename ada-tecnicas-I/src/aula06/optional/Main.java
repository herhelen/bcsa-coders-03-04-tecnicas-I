package aula06.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        Optional<User> searchedUser = db.getByLogin("login 3");
        printUserLoginOptional(searchedUser);
        searchedUser.ifPresentOrElse(
            user -> printUserLogin(user),
            () -> System.out.println("ifPresentOrElse: User not found.")
        );
    }

    public static void printUserLogin(User user) {
        System.out.println(user.getLogin());
    }

    public static void printUserLoginOptional(Optional<User> user) {
        if (user.isPresent()) {
            System.out.println(user.get().getLogin());
        } else {
            System.out.println("printUserLoginOptional: User not found.");
        }
    }
}
