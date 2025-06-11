package DataHora;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {

        LocalDate dt1 = LocalDate.parse("2025-06-04");

        // diminuir dias,mes,ano em data
        LocalDate data2 = dt1.minusDays(7); // -7 dias da dt1.
        System.out.println(data2);

        // diminuir mes em data
        LocalDate data3 = dt1.minusMonths(2); // -2 meses da dt1.
        System.out.println(data3);

        // diminuir ano em data
        LocalDate data4 = dt1.minusYears(2); // -2 anos da dt1.
        System.out.println(data4);


        // acrescentar dias em data
        LocalDate data6 = dt1.plusDays(10); // +10 dias da dt1.
        System.out.println(data6);

        // acrescentar meses em data
        LocalDate data7 = dt1.plusDays(4); // +4 meses da dt1.
        System.out.println(data7);

        // acrescentar ano em data
        LocalDate data8 = dt1.plusYears(5); // +4 meses da dt1.
        System.out.println(data8);



        LocalDateTime dtm1 = LocalDateTime.parse("2024-07-04T14:30");

        // diminuir hora
        LocalDateTime dateTime1 = dtm1.minusHours(1); // -1 hora da dtm1.
        System.out.println(dateTime1);

        // diminuir minutos
        LocalDateTime dateTime2 = dtm1.minusMinutes(10); // -10 minutos da dtm1.
        System.out.println(dateTime2);

        // acrescentar hora
        LocalDateTime dateTime3 = dtm1.plusHours(5); // +5 hora da dtm1.
        System.out.println(dateTime3);

        // acrescentar minutos
        LocalDateTime dateTime4 = dtm1.minusMinutes(20); // +20 minutos da dtm1.
        System.out.println(dateTime4);

        Instant dtglobal = Instant.parse("2023-07-04T15:10:05Z");

        // diminuir ou acrescentar dias,mes e ano em data Global
        // 1 - passo converter DATA Global para DATA Local

        LocalDateTime dataGlobal1 = LocalDateTime.ofInstant(dtglobal, ZoneId.systemDefault());// considerando GMT do computador Atual.
        LocalDateTime daataGlobal2 = dataGlobal1.minusDays(2); // -2 dias
        System.out.println(daataGlobal2);


        // Calcular Duração entre 2 data...

        LocalDateTime dtm2 = LocalDateTime.parse("2024-07-04T14:30");
        LocalDateTime data20 = dtm2.plusDays(10); // +10 dias da dtm2.

        Duration t1 = Duration.between(dtm2,data20);
        System.out.println(t1.toDays());


        //Calcular Duração entre 2 data que nao tem hora
        LocalDate dtm3 = LocalDate.parse("2024-07-04");
        LocalDate localDate = dtm3.plusDays(20); // + 20 dias na data dtm3

        Duration t2 = Duration.between(dtm3.atStartOfDay(),localDate.atStartOfDay());
        System.out.println(t2.toDays());

        // OBS: para calcular datas, duração com DATA GLOBAL dica é converter para DATA LOCAL!



    }
}
