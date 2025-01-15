package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula91_arrays_exercicios_entities.Person;

public class MaisVelho09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = scan.nextInt();

		Person[] personArray = new Person[n];

		for (int i = 0; i < personArray.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Idade: ");
			int idade = scan.nextInt();

			personArray[i] = new Person(nome, idade);
		}

		System.out.printf("PESSOA MAIS VELHA: %s", Person.pessoaMaisVelha(personArray));

		scan.close();
	}

}
