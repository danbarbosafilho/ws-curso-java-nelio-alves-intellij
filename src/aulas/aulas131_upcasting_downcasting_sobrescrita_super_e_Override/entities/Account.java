package aulas.aulas131_upcasting_downcasting_sobrescrita_super_e_Override.entities;

public class Account {

    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // Todas as classes filhas terão o mesmo metodo
    // com a mesma funcionalidade de subtrair 5,00
    // no saque.
    public void withdraw(Double amount) {
        this.balance -= amount + 5;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return number +
                "\n" + holder +
                "\n" + balance;
    }
}
