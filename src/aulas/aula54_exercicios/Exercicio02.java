package aulas.aula54_exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo)
		 */

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int in = 0, out = 0;

		for (int i = 1; i <= N; i++) {
			int X = scan.nextInt();
			if (X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.printf("%d in%n%d out%n", in, out);

		scan.close();
	}

}
