package aulas.aula70_poo_exercicios_application_atributos_metodos_this;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula70_poo_exercicios_entities_atributos_metodos_this.Student;

public class MainThree {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student studentOne = new Student();
		studentOne.name = scan.nextLine();
		studentOne.gradeOne = scan.nextDouble();
		studentOne.gradeTwo = scan.nextDouble();
		studentOne.gradeThree = scan.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", studentOne.finalGrade());
		System.out.println(studentOne.showResult());
		
		scan.close();
	}

}
