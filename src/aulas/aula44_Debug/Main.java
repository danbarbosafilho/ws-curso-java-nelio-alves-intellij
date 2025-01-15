package aulas.aula44_Debug;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Para marcar uma linha de breakpoint
		//    - Run > Toogle Breakpoint
		
		// Para iniciar o Debug
		//    - Botão direito no Main > Debug as > Java Aplication
		
		// Para interromper o Debug
		//    Botão vermelho "Terminate"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
