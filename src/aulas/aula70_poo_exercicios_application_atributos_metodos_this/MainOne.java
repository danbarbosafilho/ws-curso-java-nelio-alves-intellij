package aulas.aula70_poo_exercicios_application_atributos_metodos_this;

import java.util.Locale;
import java.util.Scanner;

import aulas.aula70_poo_exercicios_entities_atributos_metodos_this.Rectangle;

public class MainOne {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		Rectangle rectangleOne = new Rectangle();
		
		rectangleOne.width = scan.nextDouble();
		rectangleOne.height = scan.nextDouble();
		
		System.out.println(rectangleOne);
		
		scan.close();
	}

}
