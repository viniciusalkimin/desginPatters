package com.alkimin.vinicius.orcamento.estado;

import com.alkimin.vinicius.orcamento.Orcamento;

public class Reprovado extends EstadoPedido {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoPedido(new Finalizado());
    }
}
