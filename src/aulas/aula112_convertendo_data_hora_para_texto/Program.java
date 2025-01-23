package aulas.aula112_convertendo_data_hora_para_texto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        // Transformar data-hora e formato customizado
        LocalDate d04 = LocalDate.parse("2025-01-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-21T01:30:07");
        Instant d06 = Instant.parse("2025-01-21T01:30:07Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // Metodo withZone. especifica o fuso horário, e o ZoneId.systemDefault() adiciona o fuso do PC do usuário

        // Três diferentes formas de imprimir o mesmo objeto para texto
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();
        System.out.println("d05 = " + d05.format(fmt1)); // fmt1 não possui formatação de hora
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println();
        System.out.println("d06 = " + fmt3.format(d06));
        // A classe Instant não possui metodo format, então é chamado diretamente pelo fmt4 da classe DateTimeFormatter
        // A classe Instant também não aceita formatação sem declaração do fuso horário (.withZone(ZoneId))
    }
}
