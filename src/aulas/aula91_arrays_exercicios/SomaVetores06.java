package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scan.nextInt();

		System.out.println("Digite os valores do vetor A:");
		int[] vetorA = new int[n];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		int[] vetorB = new int[n];

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = scan.nextInt();
		}

		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + vetorB[i]);
		}

		scan.close();
	}
}
