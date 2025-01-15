package aulas.aula76_metodo_construtor_entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Método Construtor que obriga informações de atributos devido aos parâmetros
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Método construtor pardrão, possiblitando não haver parâmetros na criação
	public Product() {
		
	}
	
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

