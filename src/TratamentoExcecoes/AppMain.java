package TratamentoExcecoes;

import TratamentoExcecoes.Exception.ErrorException;
import TratamentoExcecoes.entity.Reservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner scanner = new Scanner(System.in);
        Reservation reservation = new Reservation();

        try {

            System.out.println("Informe numero do quarto desejado:");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe data inicio: (dd/MM/yyyy HH:mm)");
            LocalDateTime dateInicio =LocalDateTime.parse(scanner.nextLine(),formatter);
            System.out.println("Informe data fim: (dd/MM/yyyy HH:mm)");
            LocalDateTime dateFim = LocalDateTime.parse(scanner.nextLine(),formatter);


            if(reservation.validation(dateInicio,dateFim)){
                reservation.setRoomNumber(numero);
                reservation.setCheckIn(dateInicio);
                reservation.setCheckOut(dateFim);
                System.out.println(reservation);
            }


        } catch (ErrorException e) {
           System.out.println("Erro: "+e.getMessage());

        } catch (InputMismatchException e){
           System.out.println("Erro, Por favor digita Numero");
        }catch (DateTimeParseException e){

            System.out.println("Erro, Por favor digita data nesse formato (dd/MM/yyyy HH:mm)");
        }
        finally {
            scanner.close();
            System.out.println("FIM");
        }

    }

}
