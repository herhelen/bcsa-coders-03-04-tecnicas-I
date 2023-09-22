package aula03.ex02;

import java.util.function.BiFunction;

public class Calculadora {

    public static Integer executar(Integer a, Integer b, BiFunction<Integer, Integer, Integer> operacao) {
        return operacao.apply(a, b);
    }
}
