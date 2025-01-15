package aulas.aula25_casting;

public class Main {

	public static void main(String[] args) {

		// Sem casting
		int a, b, result;

		a = 5;
		b = 2;
		result = a / b;

		System.out.println(result); // Resultado: 2

		// Com casting
		int a2, b2;
		double result2;

		a2 = 5;
		b2 = 2;
		result2 = (double) a2 / b2;

		System.out.println(result2); // Resultado: 2.5
		
	}
}
