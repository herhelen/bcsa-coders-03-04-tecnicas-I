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
}
