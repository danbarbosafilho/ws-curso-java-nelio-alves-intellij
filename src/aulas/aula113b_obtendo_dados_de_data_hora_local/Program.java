package aulas.aula113b_obtendo_dados_de_data_hora_local;

import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

        // Obtendo dados a partir de data-hora local
        LocalDateTime d04 = LocalDateTime.parse("2025-01-21T01:30:07");

        System.out.println("Day = " + d04.getDayOfMonth());
        System.out.println("Month = " + d04.getMonthValue());
        System.out.println("Year = " + d04.getYear());
        System.out.println("Hour = " + d04.getHour());
        System.out.println("Minute = " + d04.getMinute());
        System.out.println("Seconds = " + d04.getSecond());
    }
}
