package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraMain {
    public static void main(String[] args) {

        //OBS: DATA e HORA o tipo é STRING!

        System.out.println("\tDATA_HORA_LOCAL");
        LocalDate data1 = LocalDate.now();
        System.out.printf("Data: %s%n",data1);

        LocalDateTime data2 = LocalDateTime.now();
        System.out.printf("Data_Hora: %s%n",data2);
        System.out.println("==========================");

        System.out.println("\tDATA_HORA_GLOBAL");
        Instant data3 = Instant.now();
        System.out.printf("Data_Hora: %s%n",data3); // por padrao o GMT é de londres, tenho que converte
        System.out.println("=========================="); // para GMT local da maquina de quem solicitou a visualização da DATA_HORA.

        System.out.println("\tConvertendo DATA_Local TEXTO para ISO 8601");
        LocalDate data4 = LocalDate.parse("2025-06-03");
        System.out.printf("Data: %s%n",data4);


        LocalDateTime data5 = LocalDateTime.parse("2025-06-03T02:30:05");
        System.out.printf("Data_Hora: %s%n",data5);
        System.out.println("==========================");

        System.out.println("\tConvertendo DATA_HORA_Global TEXTO para ISO 8601");
        Instant data6 = Instant.parse("2025-06-03T02:30:05z");
        System.out.printf("Data_Hora: %s%n",data6);

        Instant data7 = Instant.parse("2025-06-03T02:30:05-03:00"); // GMT DE São paulo
        System.out.printf("Data_Hora_COM GMT: %s%n",data7); // ao mostrar vai a parecer no horario de londres. pq e o padrao.
        System.out.println("==========================");


        System.out.println("\tConvertendo  DATA_Local que não segue o padrao ISO 8601");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data8 = LocalDate.parse("03/06/2025",fmt);
        System.out.printf("Data: %s%n",data8);


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data9 = LocalDateTime.parse("03/06/2025 13:50",fmt1);
        System.out.printf("Data_Hora: %s%n",data9);
        System.out.println("==========================");


        System.out.println("\tPEGANDO DATA_HORA separadamente");

        LocalDate data10 = LocalDate.of(2025,06,03);
        System.out.printf("Data_Hora: %s%n",data10);

        LocalDateTime data11 = LocalDateTime.of(2025,06,03,15,50);
        System.out.printf("Data_Hora: %s%n",data11);
        System.out.println("==========================");


        System.out.println("\tConvertendo DATA_HORA_Local do padrao ISO 8601 para personalizado.");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPersonalizado1 = LocalDate.parse("2025-06-03");

        System.out.printf("Data: %s%n",dataPersonalizado1.format(fmt3));

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataPersonalizado2 = LocalDateTime.parse("2025-06-03T13:50");
        System.out.printf("Data_Hora: %s%n",dataPersonalizado2.format(fmt4));


        System.out.println("\tConvertendo DATA_HORA_Global do padrao ISO 8601 para personalizado.");
        Instant dataPersolizado3 = Instant.now();
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());// considerando GMT do computador Atual.
        System.out.printf("Data_Hora: %s%n",fmt5.format(dataPersolizado3));


        System.out.println("\tConvertendo DATA_HORA_Global para DATA_HORA_LOCAL.");
        Instant data13 = Instant.parse("2025-06-03T02:30:05z");
        LocalDateTime data14 = LocalDateTime.ofInstant(data13,ZoneId.systemDefault());// considerando GMT do computador Atual.
        System.out.printf("Data_Hora: %s%n",data14);

        LocalDateTime data15 = LocalDateTime.ofInstant(data13,ZoneId.of("Portugal"));// GMT DESEJADO.
        System.out.printf("Data_Hora: %s%n",data15);

        /*
        ZoneID.OF -> Valido so rodar esse codigo..

        for( String s: ZoneId.getAvailableZoneIds()){

            System.out.println(s);
        }
         */
    }
}
