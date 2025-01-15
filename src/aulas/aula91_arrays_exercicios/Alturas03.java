package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula91_arrays_exercicios_entities.Pessoa;

public class Alturas03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scan.nextInt();

		Pessoa[] arrayPessoa = new Pessoa[n];

		for (int i = 0; i < arrayPessoa.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			System.out.print("Altura: ");
			double altura = scan.nextDouble();

			arrayPessoa[i] = new Pessoa(nome, idade, altura);
		}

		System.out.printf("\nAltura média: %.2f", Pessoa.alturaMedia(arrayPessoa));
		System.out.printf("\nPesoas com menos de 16 anos: %.1f%%", Pessoa.percentualDeMenores(arrayPessoa));
		Pessoa.exibirNomeDeMenores(arrayPessoa);

		scan.close();
	}

}
