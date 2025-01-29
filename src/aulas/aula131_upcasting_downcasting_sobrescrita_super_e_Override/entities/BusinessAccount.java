package aulas.aula131_upcasting_downcasting_sobrescrita_super_e_Override.entities;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        this.balance += amount - 10.00;
    }

    /*
    Aqui o objetivo é ter um desconto de 7,00 no saque.
    Como a classe mãe já desconta 5,00, a sua funcionalidade
    é chamada com o uso da palavra "super", e logo abaixo
    é acrescido o restante do desconto.
    */
    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

    @Override
    public String toString() {
        return number +
                "\n" + holder +
                "\n" + balance +
                "\n" + String.format("%.2f", loanLimit);
    }
}
