package aula06.methodReference.constructor;

@FunctionalInterface
public interface DataBaseAttribute {

    User getUser(String login, String pwd);
}
