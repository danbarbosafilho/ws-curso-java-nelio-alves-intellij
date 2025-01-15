package aulas.aula36_exercícios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextDouble();
		String intervalo = null;
		
		if (valor < 0 || valor >= 100.01) {
			intervalo = "Fora de intervalo"; 
		} else if (valor <= 25.00) {
			intervalo = "Intervalo [0,25]";
		} else if (valor <= 50.00) {
			intervalo = "Intervalo (25,50]";
		} else if (valor <= 75.00) {
			intervalo = "Intervalo (50,75]";
		} else
			intervalo = "Intervalo (75,100]";
			
		System.out.println(intervalo);
		
		scan.close();
	}

}
