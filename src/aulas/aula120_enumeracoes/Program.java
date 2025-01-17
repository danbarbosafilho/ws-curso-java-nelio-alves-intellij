package aulas.aula120_enumeracoes;

import aulas.aula120_enumeracoes_entities.Order;
import aulas.aula120_enumeracoes_entities.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Order orderOne = new Order(101, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(orderOne);

        OrderStatus orderOne1 = OrderStatus.DELIVERED;

        // 1. Convertendo String para o enum
        String status = scan.next();
        OrderStatus orderOne2 = OrderStatus.valueOf(status);

        System.out.println(orderOne1);
        System.out.println(orderOne2);

        scan.close();
    }
}

/*
- 1. CONVERSÃO DE STRING PARA ENUM
Em uma aplicação, eventualmente pode ser pedido que o usuário
informe algum valor de um enum. O valor digitado será um String,
que precisará ser convertido para um enum.
Para isso, basta utilizar o metodo "valueOf()". O valor digitado
pelo usuário precisa ser igual a um dos valores do enum

Exemplo:
OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

Para o desenvolver, contudo, a chamada pode ser feita sem conversão.

Exemplo:
OrderStatus os2 = OrderStatus.DELIVERED;
*/