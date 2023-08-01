package com.alkimin.vinicius;

import com.alkimin.vinicius.pedido.GeradorDePedido;
import com.alkimin.vinicius.pedido.GeradorDePedidoHandler;
import com.alkimin.vinicius.pedido.acao.EnviarEmailPedido;
import com.alkimin.vinicius.pedido.acao.LogDePedido;
import com.alkimin.vinicius.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class TestarGeradorDePedidos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente = "Fulano da Silva";
        BigDecimal valorOrcamento = new BigDecimal("250");
        int quantidade = Integer.parseInt("2");

        GeradorDePedido geradorDePedido = new GeradorDePedido(cliente, valorOrcamento, quantidade);
        GeradorDePedidoHandler geradorDePedidoHandler = new GeradorDePedidoHandler(
                Arrays.asList(
                        new EnviarEmailPedido(),
                        new SalvarPedidoNoBancoDeDados(),
                        new LogDePedido()
                )
        );

        geradorDePedidoHandler.executar(geradorDePedido);

        sc.close();
    }
}
