package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scan.nextInt();

		int[] numberVetor = new int[n];

		double mediaPares = 0;
		int totalPares = 0;

		for (int i = 0; i < numberVetor.length; i++) {
			System.out.print("Digite um numero: ");
			numberVetor[i] = scan.nextInt();

			if (numberVetor[i] % 2 == 0) {
				mediaPares += numberVetor[i];
				totalPares++;
			}
		}

		if (mediaPares > 0) {
			System.out.printf("MEDIA DOS PARES: %.1f", mediaPares / totalPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		scan.close();
	}
}
