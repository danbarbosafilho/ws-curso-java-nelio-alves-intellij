package aulas.aula139_exercicio_classes_metodos_Abstratos.entities;


/*
 - Uma classe abstrata não pode ser instanciada, mas apenas herdada.
 - Tod0 metodo genérico que não possui implementação na classe mãe,
   mas possui nas classes filhas, deve ser abstrato na classe mãe.
 - Tod0 metodo abstrato deve ser obrigatoriamente sobrescrito pelas
   classes filhas.
 - Caso uma classe possua pelo menos um metodo abstrato, então
   obrigatoriamente a classe também deve ser abstrata.
*/

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public abstract Double calculeTax();
}