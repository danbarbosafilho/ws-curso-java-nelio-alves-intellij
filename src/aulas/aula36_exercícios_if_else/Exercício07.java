package aulas.aula36_exercícios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {

		// Leia 2 valores com uma casa decimal (x e y), que devem representar
		// as coordenadas de um ponto em um plano. A seguir, determine qual o
		// quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
		// cartesianos ou na origem (x = y = 0).
		
		// Se o ponto estiver na origem, escreva a mensagem “Origem”

		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”,
		// conforme for a situação.

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double x = scan.nextDouble();
		double y = scan.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x >= -5.0 && x <= 5.0 && y == 0) {
			System.out.println("Eixo X");
		} else if (y >= -5.0 && y <= 5.0 && x == 0) {
			System.out.println("Eixo Y");
		} else if (x >= 0.1 && x <= 5.0 && y >= 0.1 && y <= 5.0) {
			System.out.println("Q1");
		} else if (x <= -0.1 && x >= -5.0 && y >= 0.1 && y <= 5.0) {
			System.out.println("Q2");
		} else if (x <= -0.1 && x >= -5.0 && y <= -0.1 && y >= -5.0) {
			System.out.println("Q3");
		} else if (x >= 0.1 && x <= 5.0 && y <= -0.1 && y >= -5.0) {
			System.out.println("Q4");
		} else
			System.out.println("Ponto fora do quadrante");

		scan.close();
	}

}
