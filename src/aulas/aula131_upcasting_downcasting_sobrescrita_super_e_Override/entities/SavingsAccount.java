package aulas.aula131_upcasting_downcasting_sobrescrita_super_e_Override.entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        this.balance -= this.balance * (interestRate / 100);
    }

    // Polimorfismo de Sobrescrita. Aqui, a classe filha possui
    // o mesmo metodo e assinatura da classe mãe, mas uma função
    // diferente, não subtraindo 5,00 no saque.

    // A palavra @Override informa ao compilador que este não é
    // um metodo qualquer, mas sim herdado de uma classe mãe.
    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return number +
                "\n" + holder +
                "\n" + balance +
                "\n" + String.format("%.2f", interestRate) + "%";
    }

}
