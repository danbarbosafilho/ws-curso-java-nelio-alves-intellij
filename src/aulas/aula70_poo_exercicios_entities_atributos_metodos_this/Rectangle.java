package aulas.aula70_poo_exercicios_entities_atributos_metodos_this;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width * 2 + height * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}
	
	public String toString() {
		return "AREA = "
			+ String.format("%.2f", area())
			+ "\nPERIMETER = "
			+ String.format("%.2f", perimeter())
			+ "\nDIAGONAL = "
			+ String.format("%.2f", diagonal());
	}
	
}
