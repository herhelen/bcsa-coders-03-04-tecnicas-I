package aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PrimeiraAula {
    public static void main(String[] args) {

        // não dá para fazer new LocalDate => usa design pattern Factory

        // imprime a data de hoje
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // imprime a hora de agora
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        // impeime a data e a hora atual
        LocalDateTime diaHora = LocalDateTime.now();
        System.out.println(diaHora);

        

    }
}
