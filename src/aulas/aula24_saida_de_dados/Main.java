package aulas.aula24_saida_de_dados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Entrada e saída com interpolação
		String nome = "Maria";
		int idade = 35;
		String profissao = "Engenheira de Software";
		double salario = 19.500;

		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos, é %s e seu salário é de $ %.3f dólares.%n%n", nome, idade, profissao, salario);

		// Entrada e saída com concatenação
		double x = 10.74;

		System.out.println("RESULTADO = " + x + " METROS");

	}

}
