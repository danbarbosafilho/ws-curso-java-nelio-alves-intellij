package aulas.aula36_exercícios_if_else;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
		// mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se
		// os valores lidos são múltiplos entre si. Atenção: os números devem
		// poder ser digitados em crescente ou decrescente.

		Scanner scan = new Scanner(System.in);

		int numeroA = scan.nextInt();
		int numeroB = scan.nextInt();

		if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}

		scan.close();
	}

}
