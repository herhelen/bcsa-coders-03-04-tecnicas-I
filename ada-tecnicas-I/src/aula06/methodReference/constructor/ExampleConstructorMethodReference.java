package aula06.methodReference.constructor;

public class ExampleConstructorMethodReference {

    public static void main(String[] args) {
        String login = "Login";
        String pwd = "Password";
        User user = new User(login, pwd);

        DataBase dbLambda = () -> new User();
        System.out.println(dbLambda.getUser());

        DataBase dbMethodReference = User::new;
        System.out.println(dbMethodReference.getUser());

        DataBaseAttribute dbaLambda = (l, p) -> new User(l, p);
        System.out.println(dbaLambda.getUser("dbaLambda", "dbaLambda").getLogin());

        DataBaseAttribute dbaMethodReference = User::new;
        System.out.println(
                dbaMethodReference.getUser("dbaMethodReference", "dbaMethodReference").getLogin());

    }


}
