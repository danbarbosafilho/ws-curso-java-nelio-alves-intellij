package aulas.aula139_exercicio_classes_metodos_Abstratos.entities;

public class Company extends TaxPayer {

    private Integer totalEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer totalEmployees) {
        super(name, anualIncome);
        this.totalEmployees = totalEmployees;
    }

    public Integer getTotalEmployees() {
        return totalEmployees;
    }

    @Override
    public Double calculeTax() {
        if (getTotalEmployees() <= 10) {
            return getAnualIncome() * 0.16;
        } else {
            return getAnualIncome() * 0.14;
        }
    }
}




