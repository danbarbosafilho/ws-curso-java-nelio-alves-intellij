package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();

		double[] numberArray = new double[n];
		
		double number = 0.0;
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Digite um numero: ");
			number = scan.nextDouble();
			numberArray[i] = number;
		}
		
		double soma = 0.0;
		double media = 0.0;
		
		System.out.print("\nVALORES = ");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + "  ");
			soma += numberArray[i];
			media += numberArray[i];
		}

		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMEDIA = %.2f\n", media / numberArray.length);
		
		scan.close();
	}

}
