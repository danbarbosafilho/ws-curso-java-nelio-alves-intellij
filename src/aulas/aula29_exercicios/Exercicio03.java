package aulas.aula29_exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		A seguir, calcule e mostre a diferença do produto de A e B pelo 
		produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe os valores de A, B, C e D:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int diferenca = (a * b) - (c * d);

		System.out.printf("DIFERENÇA = %d", diferenca);

		scan.close();
	}

}
