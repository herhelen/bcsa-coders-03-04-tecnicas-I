package aula04;

import java.util.Arrays;
import java.util.List;

public class ProblemaStream {

    public static void main(String[] args) {
        // lista de números inteiros multiplicar cada valor por 2

        // List é imutável que não permite adicionar novos valores
        // nem modificar os valores já existentes
//        List<Integer> lista = List.of(2, 3, 4, 5, 6);

        // ArrayList é imutável também, mas permite modificar
        // os valores já existentes
        List<Integer> lista = Arrays.asList(2, 3, 4, 5, 6);

//        for(Integer i : lista) {
//            System.out.println(i * 2);
//        }

        for(int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) * 2);
        }
        System.out.println(lista);
    }
}
