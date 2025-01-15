package aulas.aula40_Expressao_Condicional_Ternaria;

public class Main {

	public static void main(String[] args) {

		// Opção comum
		double preco1 = 34.5;
		double desconto1;
		
		if (preco1 < 20.0) {
			desconto1 = preco1 * 0.1;
		} else {
			desconto1 = preco1 * 0.05;
		}
		
		System.out.printf("Preço: %.2f%nDesconto: %.2f%n%n", preco1, desconto1);

		// Opção alternativa simplificada com Expressão Condiconal Ternária
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;

		System.out.printf("Preço: %.2f%nDesconto: %.2f%n", preco2, desconto2);

	}

}
