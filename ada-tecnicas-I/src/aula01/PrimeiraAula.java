package aula01;

import java.time.*;

public class PrimeiraAula {
    public static void main(String[] args) {

        // não dá para fazer new LocalDate => usa design pattern Factory

        // imprime a data de hoje
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // imprime a hora de agora
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        // imprime a data e a hora atual
        // 2023-09-15T20:27:08.018628300 => T
        LocalDateTime diaHora = LocalDateTime.now();
        System.out.println(diaHora);

        // imprime uma data escolhida
        LocalDate dataEscolhida = LocalDate.of(2021, 1, 31);
        System.out.println(dataEscolhida);
//        LocalDate dataErrada = LocalDate.of(2023, Month.FEBRUARY, 30);

        // imprime 50o dia do ano de 2023
        LocalDate diaDoAno = LocalDate.ofYearDay(2023, 50);
        System.out.println(diaDoAno);

        LocalTime horaMinuto = LocalTime.of(20, 30);
        System.out.println(horaMinuto);
        LocalTime horaMinutoSegundo = LocalTime.of(20, 30, 35);
        System.out.println(horaMinutoSegundo);

//        System.out.println(LocalTime.of(23, 60)); // minutos fora do limite

        LocalDateTime anoMesHoraMinuto = LocalDateTime.of(2023, Month.SEPTEMBER, 15,
                20, 49, 20);
        System.out.println(anoMesHoraMinuto);

        LocalDateTime dataHoraPersonalizada = LocalDateTime.of(hoje, horaMinutoSegundo);
        System.out.println(dataHoraPersonalizada);

        // Comparação entre datas

        LocalDate dataFutura = LocalDate.of(2023, Month.DECEMBER, 12);
        LocalDate dataAtual = LocalDate.now();
        System.out.println("data futura é depois da data atual? " + dataFutura.isAfter(dataAtual));
        System.out.println("data futura é antes da data atual? " + dataFutura.isBefore(dataAtual));

        LocalDateTime dataHoraFutura = LocalDateTime.of(2023, Month.SEPTEMBER, 15,
                22,0, 0);
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("dataHoraFutura é depois da dataHoraAtual? " + dataHoraFutura.isAfter(dataHoraAtual));
        System.out.println("dataHoraFutura é antes da dataHoraAtual? " + dataHoraFutura.isBefore(dataHoraAtual));

    }
}
