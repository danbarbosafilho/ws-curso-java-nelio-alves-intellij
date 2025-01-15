package aulas.aula36_exercícios_if_else;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro: ");
		int numero = scan.nextInt();
		
		if (numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		scan.close();
	}

}
