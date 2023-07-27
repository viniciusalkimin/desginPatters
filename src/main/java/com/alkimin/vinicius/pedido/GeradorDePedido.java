package com.alkimin.vinicius.pedido;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class GeradorDePedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

}
