package com.alkimin.vinicius.pedido.acao;

import com.alkimin.vinicius.pedido.Pedido;

public class LogDePedido implements AcaoAposPedidoCriado{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Logando detalhes do pedido: " + pedido);
    }
}
