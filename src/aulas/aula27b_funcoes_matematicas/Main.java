package aulas.aula27b_funcoes_matematicas;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		System.out.printf("A raiz quadrada de %.1f é %f%n", x, A);
		System.out.printf("A raiz quadrada de %.1f é %f%n", y, B);
		System.out.printf("A raiz quadrada de 25 é %f%n", C);
		
		A = Math.pow(x, y);
		B = Math.pow(y, 2.0);
		C = Math.pow(z, 3);
		System.out.printf("%.1f elevado a %.1f é igual a %.1f%n", x, y, A);
		System.out.printf("%.1f elevado 2.0 é igual a %f%n", y, B);
		System.out.printf("%.1f elevado a 3 é igual a %.1f%n", z, C);
		
		// Fórmula de Bhaskara e delta
		// double a = 0, b = 0, c = 0;
		// double delta = Math.pow(b, 2) - 4*a*c;
		// double x1 = -b + Math.sqrt(delta) / 2*a;
		// double x2 = -b - Math.sqrt(delta) / 2*a;
		
	}

}
