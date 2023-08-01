package com.alkimin.vinicius.orcamento;

import com.alkimin.vinicius.orcamento.estado.EmAnalise;
import com.alkimin.vinicius.orcamento.estado.EstadoPedido;
import com.alkimin.vinicius.orcamento.estado.Finalizado;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
public class Orcamento implements Orcavel{


    @Getter
    private BigDecimal valor;

    @Getter
    private List<Orcavel> itensPedido;

    private EstadoPedido estadoPedido;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itensPedido = new ArrayList<>();
        this.estadoPedido = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.estadoPedido.calcularDescontoExtra(this);
        this.valor = valor.subtract(valorDescontoExtra);
    }

    public int quantidadeItens() {
        return itensPedido.size();
    }

    public void adicionarItem(Orcavel orcavel) {
        this.valor = valor.add(orcavel.getValor());
        this.itensPedido.add(orcavel);
    }


    public void aprovar() { this.estadoPedido.aprovar(this); }

    public void reprovar() {
        this.estadoPedido.reprovar(this);
    }

    public void finalizar() {
        this.estadoPedido.finalizar(this);
    }

    public boolean isFinalizado() {
        return estadoPedido instanceof Finalizado;
    }
}
