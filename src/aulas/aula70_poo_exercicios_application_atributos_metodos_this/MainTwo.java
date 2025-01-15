package aulas.aula70_poo_exercicios_application_atributos_metodos_this;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula70_poo_exercicios_entities_atributos_metodos_this.Employee;

public class MainTwo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee employeeOne = new Employee();
		
		System.out.print("Name: ");
		employeeOne.name = scan.nextLine();
		System.out.print("Gross salary: ");
		employeeOne.grossSalary = scan.nextDouble();
		System.out.print("Tax: ");
		employeeOne.tax = scan.nextDouble();
		
		System.out.printf("\nEmployee: %s", employeeOne);
		
		System.out.print("\n\nWhich percentage to increase salary? ");
		employeeOne.increaseSalary(scan.nextDouble());
		
		System.out.printf("\nUpdated data: %s", employeeOne);
		
		scan.close();
	}

}
