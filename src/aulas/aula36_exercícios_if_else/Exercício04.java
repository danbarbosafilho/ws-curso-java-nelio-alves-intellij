package aulas.aula36_exercícios_if_else;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hora1 = scan.nextInt();
		int hora2 = scan.nextInt();
		int resultado;

		if (hora1 < hora2) {
			resultado = hora2 - hora1;
		} else {
			resultado = 24 - hora1 + hora2;
		}

		System.out.println("O JOGO DUROU " + resultado + " HORAS");

		scan.close();
	}

}
