package aulas.aula123_exercicio_de_composicao;

import aulas.aula123_exercicio_de_composicao.entities.Department;
import aulas.aula123_exercicio_de_composicao.entities.HourContract;
import aulas.aula123_exercicio_de_composicao.entities.Worker;
import aulas.aula123_exercicio_de_composicao.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Level: ");
        String level = scan.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();
        System.out.print("How many contracts to this worker? ");
        int numbersOfContracts = scan.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        for (int i = 0; i < numbersOfContracts; i++) {
            System.out.printf("Enter contract #%d data:\n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String valueDate = scan.next();
            LocalDate date = LocalDate.parse(valueDate, fmt1);
            System.out.print("Value per hour: ");
            double value = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = scan.nextInt();

            worker.addContract(new HourContract(date, value, duration));
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthToIncome = scan.next();
        YearMonth monthYear = YearMonth.parse(monthToIncome, fmt2);

        System.out.println(worker);
        System.out.print("Income for " + monthToIncome + ": " + String.format("%.2f", worker.income(monthYear.getYear(),
                monthYear.getMonthValue())));

        scan.close();
    }
}