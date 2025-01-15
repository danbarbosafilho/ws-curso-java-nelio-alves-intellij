package aulas.aula76_metodo_construtor_application;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula76_metodo_construtor_entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = scan.next();
		System.out.printf("Price: ");
		double price = scan.nextDouble();
		System.out.printf("Quantity in stock: ");
		int quantity = scan.nextInt();
		// Método construtor com parâmetros na instância da Classe
		Product productOne = new Product(name, price, quantity);

		// Exemplo sem o toString
		System.out.printf("%nProduct data: %s, $ %.2f, %d units, Total: $ %.2f", productOne.name, productOne.price,
		productOne.quantity, productOne.totalValueInStock());

		System.out.printf("%n%nEnter the number of products to be added in stock: ");
		productOne.addProducts(scan.nextInt());

		// Exemplo sem o toString
		System.out.printf("%nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f", productOne.name, productOne.price,
		productOne.quantity, productOne.totalValueInStock());

		System.out.printf("%n%nEnter the number of products to be removed from stock: ");
		productOne.removeProducts(scan.nextInt());

		// Exemplo com o toString inserido como método na Classe
		System.out.println(productOne);

		scan.close();

	}

}
