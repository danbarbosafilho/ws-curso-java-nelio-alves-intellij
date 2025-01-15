package aulas.aula100_list_exercicio_application;

import aulas.aula100_list_exercicio_entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int totalToRegister = scan.nextInt();

        for (int i = 0; i < totalToRegister; i++) {
            System.out.println();
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.print("Id: ");
            int id = scan.nextInt();
            while (Employee.hasId(employeeList, id)) {
                System.out.println("Id already taken. Try again: ");
                System.out.print("Id: ");
                id = scan.nextInt();
            }
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scan.nextInt();

        // The variable "result" will indicate to object, or null
        Employee result = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (result == null) {
            System.out.println("This id does not exists!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            result.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        scan.close();
    }
}
