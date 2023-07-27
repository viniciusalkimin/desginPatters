package com.alkimin.vinicius.orcamento;

import com.alkimin.vinicius.orcamento.estado.EmAnalise;
import com.alkimin.vinicius.orcamento.estado.EstadoPedido;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;


@Data
public class Orcamento {


    @Getter
    private BigDecimal valor;

    @Getter
    private int quantidadeItens;

    private EstadoPedido estadoPedido;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.estadoPedido = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.estadoPedido.calcularDescontoExtra(this);
        this.valor = valor.subtract(valorDescontoExtra);
    }

    public void aprovar() { this.estadoPedido.aprovar(this); }

    public void reprovar() {
        this.estadoPedido.reprovar(this);
    }

    public void finalizar() {
        this.estadoPedido.finalizar(this);
    }
}
