package aulas.aula29_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio00 {

	public static void main(String[] args) {

		// Calcule o preço de um terreno, informando com duas casas decimais
		// o valor da área e o preço total.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a lagura, comprimento e o preço do terreno: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double preco = scan.nextDouble();

		double total = (a * b) * preco;

		System.out.printf("AREA = %.2f%n", a * b);
		System.out.printf("PRECO = %.2f", total);

		scan.close();
	}

}
