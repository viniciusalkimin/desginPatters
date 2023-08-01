package com.alkimin.vinicius.desconto;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;



public class DescontoOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.quantidadeItens() > 5;
    }
}
