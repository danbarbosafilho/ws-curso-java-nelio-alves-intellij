package aulas.aula136_exercicio_polimorfismo_override.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName() +
                " $ " +
                String.format("%.2f",
                        totalPrice()) +
                " (Customs fee: $ " +
                String.format("%.2f",
                        customsFee) + ")";
    }
}
