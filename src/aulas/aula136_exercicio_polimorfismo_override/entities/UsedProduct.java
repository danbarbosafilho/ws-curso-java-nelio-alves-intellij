package aulas.aula136_exercicio_polimorfismo_override.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    @Override
    public String priceTag() {
        return getName() +
                " (used) $ " +
                String.format("%.2f", getPrice()) +
                " (Manufacture date: " +
                manufacturedDate.format(fmt1) +
                ")";
    }
}
