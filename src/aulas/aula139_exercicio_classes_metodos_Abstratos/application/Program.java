package aulas.aula139_exercicio_classes_metodos_Abstratos.application;

import aulas.aula139_exercicio_classes_metodos_Abstratos.entities.Company;
import aulas.aula139_exercicio_classes_metodos_Abstratos.entities.Individual;
import aulas.aula139_exercicio_classes_metodos_Abstratos.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 - Uma classe abstrata não pode ser instanciada, mas apenas herdada.
 - Tod0 metodo genérico que não possui implementação na classe mãe,
   mas possui nas classes filhas, deve ser abstrato na classe mãe.
 - Tod0 metodo abstrato deve ser obrigatoriamente sobrescrito pelas
   classes filhas.
 - Caso uma classe possua pelo menos um metodo abstrato, então
   obrigatoriamente a classe também deve ser abstrata.
*/

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<TaxPayer> taxPayersList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = scan.nextInt();

        for (int i = 0; i < numberTaxPayers; i++) {
            System.out.printf("Tax payer #%d data:\n", i + 1);
            System.out.print("Individual or Company (i/c)? ");
            char option = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = scan.nextDouble();
            if (option == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scan.nextDouble();

                taxPayersList.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (option == 'c') {
                System.out.print("Number of employees: ");
                int totalEmployees = scan.nextInt();

                taxPayersList.add(new Company(name, anualIncome, totalEmployees));
            }
        }

        double totalTaxPayer = 0.0;
        System.out.println("\nTAXES PAID:");
        for (TaxPayer taxPayer : taxPayersList) {
            System.out.println(taxPayer.getName() + ": $ " +
                    String.format("%.2f", taxPayer.calculeTax()));

            totalTaxPayer += taxPayer.calculeTax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f%n", totalTaxPayer);

        scan.close();
    }
}