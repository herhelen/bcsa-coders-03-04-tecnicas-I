package aula06.methodReference.type;

import aula06.methodReference.constructor.User;

import java.util.function.Function;

public class ExampleTypeMethodReference {

    public static void main(String[] args) {
        Function<String, Integer> countChars = s -> s.length();
        System.out.println(countChars.apply("countChars"));

        Function<String, Integer> countCharsMethodReference = String::length;
        System.out.println(countCharsMethodReference.apply("countCharsMethodReference"));

        Function<User, String> returnLoginUser = user -> user.getLogin();
        System.out.println(returnLoginUser.apply(new User("returnLoginUser", "returnLoginUser")));

        Function<User, String> returnLoginUserMR = User::getLogin;
        System.out.println(returnLoginUserMR.apply(new User("returnLoginUserMR", "returnLoginUserMR")));
    }
}
