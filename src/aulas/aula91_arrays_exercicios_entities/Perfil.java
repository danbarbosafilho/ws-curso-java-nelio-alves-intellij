package aulas.aula91_arrays_exercicios_entities;

public class Perfil {

	private double altura;
	private char genero;

	public Perfil(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public static double calcularMenorAltura(Perfil array[]) {
		double menorAltura = array[0].altura;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getAltura() < menorAltura) {
				menorAltura = array[i].getAltura();
			}
		}
		return menorAltura;
	}

	public static double calcularMaiorAltura(Perfil array[]) {
		double maiorAltura = 0.0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getAltura() > maiorAltura) {
				maiorAltura = array[i].getAltura();
			}
		}
		return maiorAltura;
	}

	public static double alturaMediaMulheres(Perfil array[]) {
		double alturaMedialMulheres = 0.0;
		int totalMulheres = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getGenero() == 'F') {
				alturaMedialMulheres += array[i].getAltura();
				totalMulheres++;
			}
		}

		alturaMedialMulheres = alturaMedialMulheres / totalMulheres;
		return alturaMedialMulheres;
	}

	public static int totalHomens(Perfil array[]) {
		int totalHomens = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].getGenero() == 'M') {
				totalHomens++;
			}
		}
		return totalHomens;
	}
}
