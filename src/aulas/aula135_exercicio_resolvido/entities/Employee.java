package aulas.aula135_exercicio_resolvido.entities;

public class Employee {

    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Double payment() {
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        return name +
                " - $ " +
                String.format("%.2f", payment());
    }
}
