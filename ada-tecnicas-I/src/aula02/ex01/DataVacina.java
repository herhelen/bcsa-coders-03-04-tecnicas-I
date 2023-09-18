package aula02.ex01;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataVacina {

    /*
    Após criarem uma vacina para uma doença rara, os médicos decidiram dividir a vacina em 3 doses
    que deve ser tomada dentro de 3 meses.
    Cria um programa que receba a data da primeira dose da vacina e imprima a data das doses.

    Exemplo:
    Data inicial: 01/02/2023

    Saída:
    Primeira dose: 01/02/2023
    Segunda dose: 01/03/2023
    Terceira dose: 01/04/2023
    */

    public static void calendarioVacinas(LocalDate primeiraDose) {

        System.out.println("Primeira dose: " + primeiraDose);
        System.out.println("Segunda dose: " + primeiraDose.plusMonths(1));
        System.out.println("Terceira dose: " + primeiraDose.plusMonths(2));
    }

    public static void main(String[] args) {
        LocalDate primeiro = LocalDate.of(2023, Month.SEPTEMBER, 1);
        calendarioVacinas(primeiro);

        LocalDate hoje = LocalDate.now();
        calendarioVacinas(hoje);
    }
}
