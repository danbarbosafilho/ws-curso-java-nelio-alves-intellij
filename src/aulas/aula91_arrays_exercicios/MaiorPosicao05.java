package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();

		double[] numberArray = new double[n];

		double biggestNumber = 0;
		int positionBiggestNumber = 0;

		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Digite um numero: ");
			numberArray[i] = scan.nextDouble();

			if (numberArray[i] > biggestNumber) {
				biggestNumber = numberArray[i];
				positionBiggestNumber = i;
			}
		}

		System.out.print("\nMAIOR VALOR = " + biggestNumber);
		System.out.print("\nPOSICAO DO MAIOR VALOR = " + positionBiggestNumber);

		scan.close();
	}
}