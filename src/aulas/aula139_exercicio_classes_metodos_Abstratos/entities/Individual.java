package aulas.aula139_exercicio_classes_metodos_Abstratos.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public Double calculeTax() {
        if (getAnualIncome() < 20000.00) {
            return (getAnualIncome() * 0.15) -
                    (healthExpenditures * 0.50);
        } else {
            return (getAnualIncome() * 0.25) -
                    (healthExpenditures * 0.50);
        }
    }
}