package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		
		int[] numberArray = new int[n];
				
		for(int i =0; i < numberArray.length; i++) {
			System.out.print("Digite um numero: ");
			numberArray[i] = scan.nextInt();
		}
		
		int parsNumbers = 0;
		System.out.printf("\nNUMEROS PARES:\n");
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i] % 2 == 0) {
				System.out.print(numberArray[i] + "  ");
				parsNumbers++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", parsNumbers);
		
		scan.close();
	}

}
