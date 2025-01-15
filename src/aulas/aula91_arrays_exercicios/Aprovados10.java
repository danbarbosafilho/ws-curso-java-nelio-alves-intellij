package aulas.aula91_arrays_exercicios;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula91_arrays_exercicios_entities.Aluno;

public class Aprovados10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = scan.nextInt();

		Aluno[] alunoArray = new Aluno[n];

		for (int i = 0; i < alunoArray.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			scan.nextLine();
			String nome = scan.nextLine();
			double nota1 = scan.nextDouble();
			double nota2 = scan.nextDouble();
			
			alunoArray[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		Aluno.calcularMedia(alunoArray);

		scan.close();
	}

}
