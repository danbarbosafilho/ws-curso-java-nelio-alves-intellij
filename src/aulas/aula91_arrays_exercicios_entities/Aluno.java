package aulas.aula91_arrays_exercicios_entities;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public static void calcularMedia(Aluno array[]) {
		double media = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			media = (array[i].nota1 + array[i].nota2) / 2;
			if(media >= 6.0) {
				System.out.println(array[i].nome);
			}
			media = 0.0;
		}
		
	}
	
}
