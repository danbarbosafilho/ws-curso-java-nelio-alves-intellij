package aulas.aula39_Switch_Case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
		case 6:
			dia = "sexta-feira";
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}

		System.out.println(dia);

		scan.close();
	}

}
