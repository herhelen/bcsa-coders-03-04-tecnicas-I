package aula03.ex02;

import java.util.function.BiFunction;

public class Main {

    /*
    Exercicio 2
    Crie uma aplicação que simule uma calculadora utilizando lambda e a interface funcional BiFunction.
    Para isso crie uma classe Calculadora com um único método chamado executar que recebe dois números
    inteiros positivos e uma BiFunction como parâmetros.
    Desenvolva a implementação para somar, subtrair, multiplicar e dividir.
    O método deve retornar o resultado da operação
    */
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> somar = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> subtrair = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplicar = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> dividir = (a, b) -> a / b;

        Integer n1 = 28;
        Integer n2 = 7;

        System.out.println("somar: " + Calculadora.executar(n1, n2, somar));
        System.out.println("subtrair: " + Calculadora.executar(n1, n2, subtrair));
        System.out.println("multiplicar: " + Calculadora.executar(n1, n2, multiplicar));
        System.out.println("dividir: " + Calculadora.executar(n1, n2, dividir));
    }
}
