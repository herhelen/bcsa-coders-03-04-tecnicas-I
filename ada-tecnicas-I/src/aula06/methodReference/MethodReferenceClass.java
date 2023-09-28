package aula06.methodReference;

public class MethodReferenceClass {

    public static void getString(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {

        Printing printingLambda = s -> System.out.println(s);
        printingLambda.getName("Teste Lambda");

        Printing printingMethodReference = MethodReferenceClass::getString;
        printingMethodReference.getName("Teste Method Reference");

    }
}
