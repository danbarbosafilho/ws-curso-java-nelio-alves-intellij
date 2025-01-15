package aulas.aula27_scanner_and_locale;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe seu nome, idade, altura, sexo e salário");
		
		String nome = scan.next();
		int idade = scan.nextInt();
		Locale.setDefault(Locale.US);
		double altura = scan.nextDouble();
		String sexo = scan.next();
		double salario = scan.nextDouble();
		
		System.out.printf("%s, %d anos de idade, %.2f de altura, sexo %s e possui %.3f de salário", nome, idade, altura, sexo, salario);
		
		scan.close();
	}

}
