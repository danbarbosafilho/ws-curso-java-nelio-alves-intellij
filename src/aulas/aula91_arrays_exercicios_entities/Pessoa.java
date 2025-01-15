package aulas.aula91_arrays_exercicios_entities;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static double alturaMedia(Pessoa arrayPessoa[]) {
		double alturaMedia = 0.0;
		for (int i = 0; i < arrayPessoa.length; i++) {
			alturaMedia += arrayPessoa[i].getAltura();
		}

		alturaMedia = alturaMedia / arrayPessoa.length;
		return alturaMedia;
	}

	public static double percentualDeMenores(Pessoa arrayPessoa[]) {
		double totalMenores = 0;
		for (int i = 0; i < arrayPessoa.length; i++) {
			if (arrayPessoa[i].getIdade() < 16) {
				totalMenores++;
			}
		}
		totalMenores = totalMenores * 100 / arrayPessoa.length;
		return totalMenores;
	}

	public static void exibirNomeDeMenores(Pessoa arrayPessoa[]) {
		System.out.println();
		for (int i = 0; i < arrayPessoa.length; i++) {
			if (arrayPessoa[i].getIdade() < 16) {
				System.out.println(arrayPessoa[i].getNome());
			}
		}
	}

}
