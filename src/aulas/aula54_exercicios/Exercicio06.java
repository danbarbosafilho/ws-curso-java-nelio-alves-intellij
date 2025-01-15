package aulas.aula54_exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		// Ler um número inteiro N e calcular todos os seus divisores.

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
