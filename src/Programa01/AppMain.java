package Programa01;

import Programa01.Enus.WorkerLevel;
import Programa01.entity.Department;
import Programa01.entity.HourContract;
import Programa01.entity.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.printf("Enter worker data:%n");
        System.out.printf("Name: ");
        String workerName = scanner.nextLine();

        System.out.printf("Level: ");
        String level = scanner.nextLine();

        System.out.printf("Base salary: ");
        Double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(level),baseSalary,new Department(departmentName));

        System.out.printf("How many contracts to this worker? ");
        int contracts = scanner.nextInt();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 1; i <=contracts; i++){
            scanner.nextLine();

            System.out.printf("Enter contract #%d%n",i);
            System.out.printf("Date (DD/MM/YYYY): ");
            String data1 = scanner.next();
            LocalDate date2 = LocalDate.parse(data1,fmt);

            System.out.printf("Value per Hour: ");
            double valueHour = scanner.nextDouble();

            System.out.printf("Duration (Hours): ");
            int durationHours = scanner.nextInt();

            HourContract contract = new HourContract(date2,valueHour,durationHours);
            worker.addContract(contract);

        }

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.printf("Enter month and year to calculate income (mm/yyyy): ");
        String monthYear = scanner.next();
        String month = monthYear.substring(0,2);
        String year = monthYear.substring(3);

        int monthValue = Integer.parseInt(month);
        int yearValue = Integer.parseInt(year);


        System.out.printf("Name: %s%n",worker.getName());
        System.out.printf("Department: %s%n",worker.getDepartment().getName());
        System.out.printf("Income for: %s %.2f",monthYear,worker.income(monthValue,yearValue));







        scanner.close();


    }
}
