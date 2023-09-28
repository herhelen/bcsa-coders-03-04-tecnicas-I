package aula06.optional;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<User> users;

    public Database() {
//        this.users = new ArrayList<>();
        this.users = List.of(
            new User("login 1", "pwd 1"),
            new User("login 2", "pwd 2")
        );
    }

    public User getByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equalsIgnoreCase(login)) {
                return user;
            }
        }

        return null;
    }
}
