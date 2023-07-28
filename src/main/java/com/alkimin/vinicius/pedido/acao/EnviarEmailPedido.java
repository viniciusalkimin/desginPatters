package com.alkimin.vinicius.pedido.acao;

import com.alkimin.vinicius.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposPedidoCriado{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar e-mail de confirmação de pedido.");
    }
}
