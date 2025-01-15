package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scan.nextInt();

		double[] numbersArray = new double[n];

		double mediaVetor = 0;
		
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print("Digite um numero: ");
			numbersArray[i] = scan.nextDouble();
			mediaVetor += numbersArray[i];
		}
		
		mediaVetor = mediaVetor / numbersArray.length;
		
		System.out.print("\nMEDIA DO VETOR = " + mediaVetor);
		System.out.print("\nELEMENTOS ABAIXO DA MEDIA:\n");
		
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] < mediaVetor) {
				System.out.println(numbersArray[i]);
			}
		}

		scan.close();
	}

}
