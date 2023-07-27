package com.alkimin.vinicius.pedido;

import com.alkimin.vinicius.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;
}
