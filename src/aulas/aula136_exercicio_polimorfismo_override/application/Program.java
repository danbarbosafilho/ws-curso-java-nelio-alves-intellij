package aulas.aula136_exercicio_polimorfismo_override.application;

import aulas.aula136_exercicio_polimorfismo_override.entities.ImportedProduct;
import aulas.aula136_exercicio_polimorfismo_override.entities.Product;
import aulas.aula136_exercicio_polimorfismo_override.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numbers = scan.nextInt();

        for (int i = 0; i < numbers; i++) {
            System.out.printf("Product #%d data:\n", i + 1);
            System.out.print("Common, used or imported (c/ u/ i)? ");
            char productType = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            if (productType == 'c') {
                productList.add(new Product(name, price));
            } else if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = scan.next();
                productList.add(new UsedProduct(name, price, LocalDate.parse(date, fmt1)));
            } else if (productType == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product x : productList) {
            System.out.println(x.priceTag());
        }

        scan.close();
    }
}