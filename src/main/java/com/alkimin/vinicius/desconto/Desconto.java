package com.alkimin.vinicius.desconto;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {

    protected Desconto proximo;

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        if(deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
}
