package Interfaces;

import Interfaces.entities.Contract;
import Interfaces.entities.Installment;
import Interfaces.services.ContractService;
import Interfaces.services.PaypalServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);



        System.out.println("Entre os dados do contrato");
        System.out.print("Numero: ");
        int number = scanner.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(),formatter);

        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        Contract obj = new Contract(number,date,totalValue);

        System.out.print("Entre com numero de parcelas: ");
        int n = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalServices());
        contractService.processContract(obj,n);

        System.out.println("Parcelas:");

        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }



        scanner.close();

    }
}
