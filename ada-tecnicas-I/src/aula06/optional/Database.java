package aula06.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
    List<User> users;

    public Database() {
//        this.users = new ArrayList<>();
        this.users = List.of(
            new User("login 1", "pwd 1"),
            new User("login 2", "pwd 2")
        );
    }

    public Optional<User> getByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equalsIgnoreCase(login)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }
}
