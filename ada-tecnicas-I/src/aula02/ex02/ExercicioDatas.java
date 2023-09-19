package aula02.ex02;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class ExercicioDatas {

    /*
    Exercício 1: Transformando Strings em Datas
    Dada uma lista de strings representando datas no formato "yyyy-MM-dd",
    converta cada uma delas em objetos LocalDate.
    List<String> datasStrings = new ArrayList<>();
    datasStrings.add("2023-08-10");
    datasStrings.add("2022-05-20");
    datasStrings.add("2021-11-30");
    */
    public static List<LocalDate> str2Date(List<String> strings) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<LocalDate> dates = new ArrayList<>();

        for(String str : strings) {
            try {
                dates.add(LocalDate.from(formatter.parse(str)));
            } catch (DateTimeParseException e) {
                System.out.println(e.getMessage());
            }
        }
        return dates;
    }

    /*
    Exercício 2: Formatação de Datas
    Dada uma lista de datas, formate cada uma delas no formato
    "dd/MM/yyyy" usando DateTimeFormatter.
    List<LocalDate> datas = new ArrayList<>();
    datas.add(LocalDate.of(2023, 8, 10));
    datas.add(LocalDate.of(2022, 5, 20));
    datas.add(LocalDate.of(2021, 11, 30));
    */
    public static List<String> date2Str(List<LocalDate> dates) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<String> strings = new ArrayList<>();

        for(LocalDate date : dates) {
            strings.add(date.format(formatter));
        }
        return strings;
    }

    /*
    Exercicio 3:
    Crie um objeto do tipo ZonedDateTime e converta ele para os 3 fusos abaixo:
    Nova York
    Paris
    Tokyo
    Imprima na tela os resultados
    */
    public static void printZonedDateTime(ZonedDateTime time) {
        System.out.println("Tempo original: " + time);
        System.out.println("NY: " + time.withZoneSameInstant(ZoneId.of("America/New_York")));
        System.out.println("Paris: " + time.withZoneSameInstant(ZoneId.of("Europe/Paris")));
        System.out.println("Tokyo: " + time.withZoneSameInstant(ZoneId.of("Asia/Tokyo")));
    }

    public static void main(String[] args) {
        List<String> datasStrings = new ArrayList<>();
        datasStrings.add("2023-08-10");
        datasStrings.add("2022-05-20");
        datasStrings.add("2021-11-30");
        System.out.println(str2Date(datasStrings));

        List<LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2023, 8, 10));
        datas.add(LocalDate.of(2022, 5, 20));
        datas.add(LocalDate.of(2021, 11, 30));
        System.out.println(date2Str(datas));

        printZonedDateTime(ZonedDateTime.now());
    }

}
