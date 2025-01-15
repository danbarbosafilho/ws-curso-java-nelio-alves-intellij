package aulas.aula29_exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Faça um programa para ler dois valores inteiros
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe dois valores inteiros");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("SOMA = " + (a + b));
		
		scan.close();
	}

}
