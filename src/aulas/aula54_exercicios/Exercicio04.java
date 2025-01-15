package aulas.aula54_exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			double numero1 = scan.nextDouble();
			double numero2 = scan.nextDouble();

			if (numero2 == 0) {
				System.out.println("divisão impossível");
			} else
				System.out.println(numero1 / numero2);
		}

		scan.close();
	}

}
