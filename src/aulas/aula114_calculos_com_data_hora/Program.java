package aulas.aula114_calculos_com_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-01-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-21T01:30:00");
        Instant d06 = Instant.parse("2025-01-21T01:30:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Cálculo entre data-horas
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
        // No t1, o objeto LocalDate não possui segundos, por isso o cálculo com
        // Duration não funcionará. É necessário convertê-lo para LocalDateTime,
        // utilizando o metodo .atTime() (como no pastWeekLocalDate), informando a
        // hora. Caso seja 0 hora e 0 minuto, pode ser substituído pelo metodo
        // atStartOfDay() (como no d04), apontando para o início do dia (meia-noite,
        // 0 hora e 0 minuto)

        System.out.println();
        System.out.println("t1 days = " + t1.toDays());
        System.out.println("t1 hours = " + t1.toHours());
        System.out.println("t2 minutes = " + t2.toMinutes());
        System.out.println("t2 seconds = " + t2.toSeconds());
        System.out.println("t3 seconds = " + t3.toDays());
        System.out.println("t4 seconds = " + t4.toDays());
    }
}
