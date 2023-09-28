package aula06.methodReference.constructor;

public class User {
    private String login;
    private String pwd;

    public User() {
    }

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }
}
