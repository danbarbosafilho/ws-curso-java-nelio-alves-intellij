package aulas.aula36_exercícios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextDouble();
		double totalImposto = 0.0;
		
		if (valor >= 0 && valor <= 2000) {
			System.out.println("Isento");
		} else if (valor > 4500) {
			totalImposto = (1000 * 0.08) + (1500 * 0.18) + ((valor - 4500) * 0.28);
			System.out.printf("R$ %.2f%n", totalImposto);
		} else if (valor > 3000) {
			totalImposto = (1000 * 0.08) + ((valor - 3000) * 0.18);
			System.out.printf("R$ %.2f%n", totalImposto);
		} else {
			totalImposto = ((valor - 2000) * 0.08);
			System.out.printf("R$ %.2f%n", totalImposto);
		}
		
		scan.close();
	}

}
