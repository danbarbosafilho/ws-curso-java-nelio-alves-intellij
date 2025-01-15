package aulas.aula29_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		// Fazer um programa que leia o número de um funcionário, seu número de
		// horas trabalhadas, o valor que recebe por hora e calcula o salário
		// funcionário. A seguir, mostre o número e o salário do
		// funcionário, com duas casas decimais.

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o ID, horas trabalhadas e preço por hora: ");
		int numberId = scan.nextInt();
		int horasTrabalhadas = scan.nextInt();
		double salarioPorHora = scan.nextDouble();

		double salario = (double) horasTrabalhadas * salarioPorHora;

		System.out.println("NUMBER = " + numberId);
		System.out.printf("SALARY = U$ %.2f", salario);

		scan.close();
	}

}
