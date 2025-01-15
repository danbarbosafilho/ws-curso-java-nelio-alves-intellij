package aulas.aula82_exercicio_POO_application;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula82_exercicio_POO_entities.Account;

/*
 * Como há multiplicidade de cadastros, o ideal seria
 * criar um array de objetos (do tipo da classe).
 * Contudo ainda não foi implementado no código, sendo
 * usado apenas instanciações de objetos.
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		char repeat;
		int i = 1;
		do {
			System.out.printf("-- ACCOUNT NUMBER #%d --\n", i);
			i++;
				
			System.out.print("Enter account number: ");
			int accountNumber = scan.nextInt();
			System.out.print("Enter account holder: ");
			scan.nextLine();
			String accountName = scan.nextLine();
			System.out.print("Is there an initial deposit (y/n)? ");
			char answer = scan.next().charAt(0);
			
			Account accountOne;
			if (answer == 'y') {
				System.out.print("Enter initial deposit value: ");
				double depositValue = scan.nextDouble();
				accountOne = new Account(accountNumber, accountName, depositValue);
			} else {
				accountOne = new Account(accountNumber, accountName);
			}

			System.out.printf("\nAccount data:\n");
			System.out.println(accountOne);
			
			System.out.printf("\nEnter a deposit value: ");
			accountOne.addDeposit(scan.nextDouble());
			System.out.println("Updated account data:");
			System.out.println(accountOne);

			System.out.printf("\nEnter a widthdraw value: ");
			accountOne.withdrawMoney(scan.nextDouble());
			System.out.println("Updated account data:");
			System.out.print(accountOne);
			
			System.out.printf("\n\nDo you wanna repeat(y/n)? ");
			repeat = scan.next().charAt(0);
			System.out.println();
		} while (repeat == 'y');
		
		System.out.println("---- END OF OPERATION ----");
		
		scan.close();
	}
}
