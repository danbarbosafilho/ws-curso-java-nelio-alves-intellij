package aulas.aula79_80_encapsulamento_automatico_and_metodos_construtores_entites;

/*
 * Botão direito -> Source -> Generate Constructor using Fields
 * Botão direito -> Source -> Generate Getters and Setters
 */

public class Product {
	
	// Atributos
	private String name;
	private double price;
	private int quantity;
	
	// Método construtor padrão
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Métodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "\nUpdated data: "
			+ name
			+ ", $ "
			+ String.format("%.2f", price)			
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
