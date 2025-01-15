package aulas.aula29_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*Fazer um programa que leia três valores com ponto flutuante 
		de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.*/

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três valores: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double trianguloRetangulo = (a * c) / 2;
		double areaCirculoRaio = 3.14159 * Math.pow(c, 2);
		double areaDoTrapezio = ((a +b) *c) / 2;
		double areaDoQuadrado = Math.pow(b, 2);
		double areaDoRetangulo = a * b;
		
		System.out.printf("TRIÂNGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CÍRCULO: %.3f%n", areaCirculoRaio);
		System.out.printf("TRAPÉZIO: %.3f%n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);
		System.out.printf("RETÂNGULO: %.3f%n", areaDoRetangulo);
		
		scan.close();
	}

}
