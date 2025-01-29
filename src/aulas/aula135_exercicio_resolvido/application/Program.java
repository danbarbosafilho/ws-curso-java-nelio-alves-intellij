package aulas.aula135_exercicio_resolvido.application;

import aulas.aula135_exercicio_resolvido.entities.Employee;
import aulas.aula135_exercicio_resolvido.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.printf("Employee #%d data:\n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char outsourced = scan.next().charAt(0);
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();

                Employee newEmployee = new OutsourcedEmployee(name, hours, valuePerHour,
                        additionalCharge);
                employees.add(newEmployee);
            } else if (outsourced == 'n') {
                Employee newEmployee = new Employee(name, hours, valuePerHour);
                employees.add(newEmployee);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee x : employees) {
            System.out.println(x);
        }

        scan.close();
    }
}
