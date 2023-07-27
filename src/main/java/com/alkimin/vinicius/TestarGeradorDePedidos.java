package com.alkimin.vinicius;

import com.alkimin.vinicius.pedido.GeradorDePedido;
import com.alkimin.vinicius.pedido.GeradorDePedidoHandler;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestarGeradorDePedidos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente = sc.nextLine();
        BigDecimal valorOrcamento = BigDecimal.valueOf(sc.nextDouble());
        int quantidade = sc.nextInt();

        GeradorDePedido geradorDePedido = new GeradorDePedido(cliente, valorOrcamento, quantidade);
        GeradorDePedidoHandler geradorDePedidoHandler = new GeradorDePedidoHandler();

        geradorDePedidoHandler.executar(geradorDePedido);

        sc.close();
    }
}
