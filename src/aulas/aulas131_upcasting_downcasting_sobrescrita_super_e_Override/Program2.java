package aulas.aulas131_upcasting_downcasting_sobrescrita_super_e_Override;

import aulas.aulas131_upcasting_downcasting_sobrescrita_super_e_Override.entities.Account;
import aulas.aulas131_upcasting_downcasting_sobrescrita_super_e_Override.entities.BusinessAccount;
import aulas.aulas131_upcasting_downcasting_sobrescrita_super_e_Override.entities.SavingsAccount;

public class Program2 {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Messi", 1000.00);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1002, "CR7", 1000.00, 300.00);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new SavingsAccount(1001, "Messi", 1000.00, 2.0);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());
    }
}
