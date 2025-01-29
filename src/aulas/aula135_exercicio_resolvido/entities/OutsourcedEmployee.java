package aulas.aula135_exercicio_resolvido.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
        return name +
                " - $ " +
                String.format("%.2f", payment());
    }
}
