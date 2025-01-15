package aulas.aula82_exercicio_POO_entities;

/*
 * 1. Valor de depósito na abertura é opcional, enquanto os outros itens são obrigatórios.
 * 2. O saldo da conta não pode ser alterado livremente, mas apenas por saques ou depósitos.
 * 3. Para cada saque realizado, o banco cobra uma taxa de $ 5.00.
 * 4. A conta pode ficar com saldo negativo se o saldo não for suficiente para realizar 
 * o saque e/ou pagar a taxa.
 * 5. A aplicação deve realizar o cadastro de uma conta, dando opção para que seja ou não
 * informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um 
 * saque, sempre mostrando os dados da conta após cada operação.
 * */

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance = 0.0;

	// Construtores
	public Account(int accountNumber, String accountHolder, double inicialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		addDeposit(inicialDeposit);
	}

	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	// Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}
	
    public String getAccountHolder() {
    	return accountHolder;
    }
    
    public void setAccountHolder(String accountHolder) {
    	this.accountHolder = accountHolder;
    }
	
	public double getBalance() {
		return balance;
	}
	
	// Métodos
	public void addDeposit(double balance) {
		this.balance += balance;
	}
	
	public void withdrawMoney(double balance) {
		this.balance -= (balance + 5.00);
	}
	
	public String toString() {
		return "Account "
			+ getAccountNumber()
			+ ", Holder: "
			+ getAccountHolder()
			+ ", Balance: $ "
			+ String.format("%.2f", getBalance());
	}
}
