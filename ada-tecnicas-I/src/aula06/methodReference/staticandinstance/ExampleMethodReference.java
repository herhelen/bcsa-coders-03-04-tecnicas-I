package aula06.methodReference.staticandinstance;

public class ExampleMethodReference {

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Verifier verifierLambda = n ->  n % 2 == 0;
        System.out.println("verifierLambda: 5 " + verifierLambda.verifyIsEven(5));
        System.out.println("verifierLambda: 8 " + verifierLambda.verifyIsEven(8));
        System.out.println();

        Verifier verifierStatic = ExampleMethodReference::isEven;
        System.out.println("verifierStatic: 5 " + verifierStatic.verifyIsEven(5));
        System.out.println("verifierStatic: 8 " + verifierStatic.verifyIsEven(8));
        System.out.println();

        var insta = new ExampleMethodReference();
        Verifier verifierInstance = insta::instanceIsEven;
        System.out.println("verifierInstance: 5 " + verifierInstance.verifyIsEven(5));
        System.out.println("verifierInstance: 8 " + verifierInstance.verifyIsEven(8));
        System.out.println();

    }

    public boolean instanceIsEven(Integer number) {
        return number % 2 == 0;
    }
}
