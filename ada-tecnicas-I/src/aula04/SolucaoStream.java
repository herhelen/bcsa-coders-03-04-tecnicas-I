package aula04;

import java.util.stream.Stream;

public class SolucaoStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5,8,9,3,1);

//        Stream<Integer> streamDobro = stream.map(n -> n * 2)
//        System.out.println(streamDobro); // Imprime endereço na memória
        
        stream.map(n -> n * 2).forEach(n -> System.out.println(n));

    }
}
