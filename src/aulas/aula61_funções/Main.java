package aulas.aula61_funções;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		showResult(max(a, b, c)); // Declaração das duas Funções showResult e max

		scan.close();
	}

	public static int max(int x, int y, int z) {
		int aux = 0;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("The higher number is " + value);
	}
}
