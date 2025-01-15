package aulas.aula100_list_exercicio_entities;

import java.util.List;

public class Employee {

    private Integer id;
    private final String name; //
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public String toString() {
        return String.format("%d", id)
                + ", "
                + name
                + ", "
                + salary;
    }

    // Verify if there are an existent id or not
    public static boolean hasId(List<Employee> list, int id){
        // The variable "resultHasId" will indicate to object, or null
        Employee resultHasId = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return resultHasId != null; // If already has id, so it will return true
    }

}
