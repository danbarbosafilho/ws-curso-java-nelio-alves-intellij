package aulas.aula113a_convertendo_data_hora_local_para_global;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-01-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-21T01:30:07");
        Instant d06 = Instant.parse("2025-01-21T01:30:07Z");

        // Convertendo data-hora global para local (sempre é necessário informar o timezone/fuso local)

        // ZoneId.getAvailableZoneIds()
        /*for (String x : ZoneId.getAvailableZoneIds()) {
            System.out.println(x);
        }*/

        // Converte o Instant para um fuso local, sendo este do PC do usuário
        LocalDate result1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        // O fuso de brasilia é de GMT -03:00, por isso o horário de 01:30 do objeto
        // do Instant d06 irá para as 22:30 do dia anterior.

        // Converte o Instant para um fuso local, sendo este agora de Portugal, com GMT +1
        LocalDate result2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime result3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime result4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("result1 = " + result1);
        System.out.println("result3 = " + result3);
        System.out.println("result2 = " + result2);
        System.out.println("result4 = " + result4);
    }
}
