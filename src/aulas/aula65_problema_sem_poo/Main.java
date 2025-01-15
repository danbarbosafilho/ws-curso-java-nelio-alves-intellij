package aulas.aula65_problema_sem_poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double Xa, Xb, Xc, Ya, Yb, Yc, areaX, areaY, pX, pY;

		System.out.println("Enter the measures of triangle X:");
		Xa = scan.nextDouble();
		Xb = scan.nextDouble();
		Xc = scan.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		Ya = scan.nextDouble();
		Yb = scan.nextDouble();
		Yc = scan.nextDouble();

		pX = (Xa + Xb + Xc) / 2;
		areaX = Math.sqrt(pX * (pX - Xa) * ( pX - Xb) * (pX - Xc));

		pY = (Ya + Yb + Yc) / 2;
		areaY = Math.sqrt(pY * (pY - Ya) * (pY - Yb) * (pY - Yc));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else
			System.out.println("Larger area: Y");

		scan.close();
	}

}
