package aulas.aula126_exercicio3_de_composicao.entities;

import aulas.aula126_exercicio3_de_composicao.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/HH/yyyy HH:mm:ss");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    private static List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double total = 0.0;
        for (OrderItem x : items) {
            total += x.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(fmt1.format(moment));
        sb.append("\nOrder status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client.getName());
        sb.append(" (" + client.getBirthDate().format(fmt2) + ") ");
        sb.append("- " + client.getEmail());
        sb.append("\nOrder items:\n");
        for (OrderItem x : items) {
            sb.append(x);
            sb.append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
