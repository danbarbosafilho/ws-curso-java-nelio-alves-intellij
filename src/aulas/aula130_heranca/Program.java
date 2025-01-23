package aulas.aula130_heranca;

import aulas.aula130_heranca.entities.Account;
import aulas.aula130_heranca.entities.BusinessAccount;

import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        BusinessAccount ba1 = new BusinessAccount(110, "Lionel Messi", 800.00,
                400.00);

        ba1.withdraw(300.00);
        ba1.deposit(1050.00);
        ba1.loan(100.00);

        Account a1 = new Account(707, "Cristiano Ronaldo", 950.00);

        a1.withdraw(300.00);
        a1.deposit(925.00);

        System.out.println(ba1);
        System.out.println();
        System.out.println(a1);

    }
}
