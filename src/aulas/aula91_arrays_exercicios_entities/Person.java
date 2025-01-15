package aulas.aula91_arrays_exercicios_entities;

public class Person {

	private String nome;
	private int idade;

	public Person(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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

	public static String pessoaMaisVelha(Person array[]) {
		int idadeMaxima = 0;
		String nomeIdadeMaxima = "";

		for (int i = 0; i < array.length; i++) {
			if (array[i].getIdade() > idadeMaxima) {
				idadeMaxima = array[i].getIdade();
				nomeIdadeMaxima = array[i].getNome();
			}
		}
		
		return nomeIdadeMaxima;
	}
}
