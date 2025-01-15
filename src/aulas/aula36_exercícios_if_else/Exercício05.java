package aulas.aula36_exercícios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		// Com base na tabela abaixo, escreva um programa que leia o código 
		// de um item e a quantidade deste item. Aseguir, calcule e mostre 
		// o valor da conta a pagar.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int codigo = scan.nextInt();
		int unidade = scan.nextInt();
		double total;
		
		if (codigo == 1) {
			total = 4.00;
		} else if (codigo == 2) {
			total = 4.50;
		} else if (codigo == 3) {
			total = 5.00;
		} else if (codigo == 4) {
			total = 2.00 ;
		} else
			total = 1.50;
		
		total *= unidade;
		
		System.out.printf("Total: %.2f%n", total);
		
		scan.close();
	}

}
