package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();

		int[] arrayNumber = new int[n];

		int number = 0;
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print("Digite um numero: ");
			number = scan.nextInt();
			arrayNumber[i] = number;
		}

		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < arrayNumber.length; i++) {
			if (arrayNumber[i] < 0) {
				System.out.println(arrayNumber[i]);
			}
		}

		scan.close();
	}

}
