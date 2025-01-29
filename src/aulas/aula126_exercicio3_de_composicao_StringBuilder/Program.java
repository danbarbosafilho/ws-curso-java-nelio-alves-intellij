package aulas.aula126_exercicio3_de_composicao_StringBuilder;

import aulas.aula126_exercicio3_de_composicao_StringBuilder.entities.Client;
import aulas.aula126_exercicio3_de_composicao_StringBuilder.entities.Order;
import aulas.aula126_exercicio3_de_composicao_StringBuilder.entities.OrderItem;
import aulas.aula126_exercicio3_de_composicao_StringBuilder.entities.Product;
import aulas.aula126_exercicio3_de_composicao_StringBuilder.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = scan.nextLine();
        LocalDate birthDate = LocalDate.parse(date, fmt1);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = scan.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status),
                new Client(name, email, birthDate));

        System.out.print("How many items to this order? ");
        int itemsQuantity = scan.nextInt();
        for (int i = 0; i < itemsQuantity; i++) {
            System.out.printf("Enter #%d item data:\n", i + 1);
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

            order.addItem(new OrderItem(quantity, new Product(productName, productPrice)));
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        scan.close();
    }
}
