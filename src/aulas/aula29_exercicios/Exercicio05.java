package aulas.aula29_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*Fazer um programa para ler o número de peças 1, o valor unitário 
		de cada peça 1, o código de uma peça 2, o número de peças 2 e o 
		valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int totalPecas1, totalPecas2;
		double valorPeca1, valorPeca2, total;

		System.out.println("Informe a quantidade e valor da peça 1: ");
		totalPecas1 = scan.nextInt();
		valorPeca1 = scan.nextDouble();

		System.out.println("Informe a quantidade e valor da peça 2: ");
		totalPecas2 = scan.nextInt();
		valorPeca2 = scan.nextDouble();

		total = (totalPecas1 * valorPeca1) + (totalPecas2 * valorPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		scan.close();
	}

}
