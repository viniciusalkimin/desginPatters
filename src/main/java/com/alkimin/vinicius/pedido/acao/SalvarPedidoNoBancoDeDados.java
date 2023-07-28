package com.alkimin.vinicius.pedido.acao;

import com.alkimin.vinicius.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposPedidoCriado{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
