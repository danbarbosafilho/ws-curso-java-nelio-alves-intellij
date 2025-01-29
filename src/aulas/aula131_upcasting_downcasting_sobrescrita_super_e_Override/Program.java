package aulas.aula131_upcasting_downcasting_sobrescrita_super_e_Override;

import aulas.aula131_upcasting_downcasting_sobrescrita_super_e_Override.entities.Account;
import aulas.aula131_upcasting_downcasting_sobrescrita_super_e_Override.entities.BusinessAccount;
import aulas.aula131_upcasting_downcasting_sobrescrita_super_e_Override.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Messi", 1000.00);
        BusinessAccount bacc = new BusinessAccount(1007, "CRonaldo", 1000.00, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1008, "Neymar", 1000.00, 450.00);
        Account acc3 = new SavingsAccount(3002, "Iniesta", 1000.00, 5.6);

        // DOWNCASTING

        // Feito o casting conforme a instância do objeto 'acc2'
        BusinessAccount bacc1 = (BusinessAccount) acc2;

        // O casting abaixo dará erro no compilador, visto que o
        // objeto 'acc3' é do tipo SavingsAccount, que é uma
        // classe irmã de BusinessAccount e não possuem relação
        // herança.
        // >>> BusinessAccount bacc2 = (BusinessAccount) acc3;

        // Para prevenir isto, criamos um verificador com a
        // palavra "instanceof" para verificar se a variáveis
        // que armazenam o objeto são do mesmo tipo.

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bacc2 = (BusinessAccount) acc3;
            bacc2.loan(350.00);
            System.out.println("Loan!");
        } else if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc4 = (SavingsAccount) acc3;
            acc4.updateBalance();
            System.out.println(acc4.getBalance());
            System.out.println("Balance updated!");
            System.out.println();
        }




    }
}
