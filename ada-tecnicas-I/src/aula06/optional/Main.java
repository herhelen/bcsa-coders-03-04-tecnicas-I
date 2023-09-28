package aula06.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();

        Optional<User> searchedNoUser = db.getByLogin("login 3");

        printUserLoginOptional(searchedNoUser);
        searchedNoUser.ifPresentOrElse(
            user -> printUserLogin(user),
            () -> System.out.println("ifPresentOrElse: User not found.")
        );
//        searchedNoUser.orElseThrow(
//            () -> new RuntimeException("orElseThrow: User not found.")
//        );
        System.out.println();

        Optional<User> searchedUser = db.getByLogin("login 2");

        printUserLoginOptional(searchedUser);
        searchedUser.ifPresentOrElse(
                user -> printUserLogin(user),
                () -> System.out.println("ifPresentOrElse: User not found.")
        );
        User user = searchedUser.orElseThrow(
                () -> new RuntimeException("orElseThrow: User not found.")
        );
        printUserLogin(user);
        System.out.println();


    }

    public static void printUserLogin(User user) {
        System.out.println("printUserLogin: " + user.getLogin());
    }

    public static void printUserLoginOptional(Optional<User> user) {
        if (user.isPresent()) {
            System.out.println("printUserLoginOptional: " + user.get().getLogin());
        } else {
            System.out.println("printUserLoginOptional: User not found.");
        }
    }
}
