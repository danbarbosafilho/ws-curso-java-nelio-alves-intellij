package aulas.aula36_exercícios_if_else;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro, e depois dizer se 
		// este número é par ou ímpar.
		
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		
		scan.close();
 	}

}
