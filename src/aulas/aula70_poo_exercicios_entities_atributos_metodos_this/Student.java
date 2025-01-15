package aulas.aula70_poo_exercicios_entities_atributos_metodos_this;

public class Student {

	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;

	public double finalGrade() {
		return gradeOne + gradeTwo + gradeThree;
	}

	public String showResult() {
		String result;
		if (finalGrade() > 60.00) {
			result = "PASS";
		} else {
			result = "FAILED\n" 
				+ "MISSING " 
				+ String.format("%.2f", 60.00 - finalGrade()) 
				+ " POINTS";
		}
		
		return result;
	}

}
