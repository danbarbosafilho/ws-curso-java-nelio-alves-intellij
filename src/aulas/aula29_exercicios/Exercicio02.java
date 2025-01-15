package aulas.aula29_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler o valor do raio de um círculo, 
		e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos*/
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio: ");
		double raio = scan.nextDouble();
		double valorDePI = 3.14159;
		double area = valorDePI * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f", area);
		
		scan.close();
	}

}
