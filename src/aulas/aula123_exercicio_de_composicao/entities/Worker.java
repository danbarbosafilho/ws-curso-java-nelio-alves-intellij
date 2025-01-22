package aulas.aula123_exercicio_de_composicao.entities;

import aulas.aula123_exercicio_de_composicao.entities.enums.WorkerLevel;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // Não há setContracts, pois isso alteraria a lista
    // já instanciada por outra, perdendo os seus itens.
    // Por isso, a lista não poderá ser trocada.

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContracts(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        double total = 0.0;
        for(HourContract x : contracts){
            if (x.getDate().getYear() == year && x.getDate().getMonthValue() == month) {
                 total += x.totalValue();
            }
        }
        return total + baseSalary;
    }

    @Override
    public String toString() {
        return "Name: " +
                getName() +
                "\nDepartment: " +
                department.getName();
    }
}
