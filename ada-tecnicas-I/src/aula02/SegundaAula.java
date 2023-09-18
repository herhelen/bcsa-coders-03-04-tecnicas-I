package aula02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class SegundaAula {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate antesOntem = LocalDate.of(2023, Month.SEPTEMBER, 16);

        // Conta os dias entre as 2 datas
        long dias = ChronoUnit.DAYS.between(antesOntem, hoje);
        System.out.println(dias);

        LocalDateTime hojeHora = LocalDateTime.now();
        LocalDateTime antesOntemHora = LocalDateTime.of(2023, Month.SEPTEMBER, 16, 20, 0);
        System.out.println(ChronoUnit.DAYS.between(antesOntemHora, hojeHora));

        // Manipulação de data
        hoje.plusDays(1);
        System.out.println(hoje);
        LocalDate amanha = hoje.plusDays(1);
        System.out.println(amanha);

        System.out.println(hoje.plusWeeks(2));
        System.out.println(hoje.plusDays(14));

        LocalDate janeiro = LocalDate.of(2023, 1, 1);
        System.out.println(janeiro.plusDays(30));
        System.out.println(janeiro.plusMonths(1));

        // minus
        System.out.println(hojeHora.minusHours(2));
        System.out.println(hojeHora.minusDays(1));

        // teste com ano bissexto
        LocalDate fevereiro = LocalDate.of(2024, 2, 29);
        System.out.println(fevereiro.plusMonths(1));

        // pode fazer encadeamento de métodos
        System.out.println(hojeHora.minusHours(1));
        System.out.println(hojeHora.minusDays(2));
        System.out.println(hojeHora.minusDays(2).minusHours(1));

        // período
        Period periodoUmAnoTresMes = Period.of(1, 3, 0);
        System.out.println(hoje.plus(periodoUmAnoTresMes));
        System.out.println(hoje.minus(periodoUmAnoTresMes));
    }
}
