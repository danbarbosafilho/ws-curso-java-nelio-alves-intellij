package aulas.aula73_metodos_estaticos_application;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula73_metodos_estaticos_util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarNumber = scan.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double realNumber = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollarNumber, realNumber));
		
		scan.close();
	}

}
