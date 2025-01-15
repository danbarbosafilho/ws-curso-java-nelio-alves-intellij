package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula91_arrays_exercicios_entities.Perfil;

public class DadosPessoas11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scan.nextInt();

		Perfil[] perfilArray = new Perfil[n];

		for (int i = 0; i < perfilArray.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = scan.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = scan.next().charAt(0);

			perfilArray[i] = new Perfil(altura, genero);
		}

		System.out.printf("Menor altura = %.2f", Perfil.calcularMenorAltura(perfilArray));
		System.out.printf("\nMaior altura = %.2f", Perfil.calcularMaiorAltura(perfilArray));
		System.out.printf("\nMedia das alturas das mulheres = %.2f", Perfil.alturaMediaMulheres(perfilArray));
		System.out.printf("\nNumero de homens = %d", Perfil.totalHomens(perfilArray));

		scan.close();
	}

}
