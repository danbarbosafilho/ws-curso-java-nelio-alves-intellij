package aulas.aula111_instanciando_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

        // Data a partir do instante atual (agora)
        LocalDate d01 = LocalDate.now(); // Local
        LocalDateTime d02 = LocalDateTime.now(); // Local
        Instant d03 = Instant.now(); // Global

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);


    }
}
