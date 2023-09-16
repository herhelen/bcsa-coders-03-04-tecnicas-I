package aula01.ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EventosEspeciais {
    /*
        Crie uma classe chamada EventosEspeciais,
        essa classe deverá representar datas de momentos especiais da sua vida.
        A classe deve conter 3 métodos chamados de evento1, evento2,
        evento3, respectivamente.
        O método de evento1 deve retornar um LocalDate
        O método de evento2 deve retornar um LocalTime
        O método de evento3 deve retornar um LocalDateTime
    * */


    public static LocalDate evento1(int ano, Month mes, int dia) {
        return LocalDate.of(ano, mes, dia);
    }

    public static LocalTime evento2(int hora, int minuto, int segundo) {
        return LocalTime.of(hora, minuto, segundo);
    }

    public static LocalDateTime evento3(int ano, Month mes, int dia,
                                        int hora, int minuto, int segundo) {
        return LocalDateTime.of(ano, mes, dia, hora, minuto, segundo);
    }

    public static LocalDateTime evento3(LocalDate data, LocalTime hora) {
        return LocalDateTime.of(data, hora);
    }

    public static void main(String[] args) {
        LocalDate evento1 = EventosEspeciais.evento1(2023, Month.AUGUST, 31);
        System.out.println(evento1);

        LocalTime evento2 = EventosEspeciais.evento2(23, 59, 59);
        System.out.println(evento2);

        LocalDateTime evento3 = EventosEspeciais.evento3(evento1, evento2);
        System.out.println(evento3);
    }
}
