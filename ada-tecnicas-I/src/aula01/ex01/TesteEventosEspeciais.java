package aula01.ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TesteEventosEspeciais {

    public static void main(String[] args) {
        LocalDate evento1 = EventosEspeciais.evento1(2023, Month.AUGUST, 31);
        System.out.println(evento1);

        LocalTime evento2 = EventosEspeciais.evento2(23, 59, 59);
        System.out.println(evento2);

        LocalDateTime evento3 = EventosEspeciais.evento3(evento1, evento2);
        System.out.println(evento3);
    }

}
