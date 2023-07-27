package com.alkimin.vinicius.pedido;

import com.alkimin.vinicius.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeradorDePedidoHandler {

    //@Autowired
    //construtor com injecao de dependências: repository, service e etc ...

    public void executar(GeradorDePedido geradorDePedido) {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"), geradorDePedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geradorDePedido.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Lógica de persistência ...");
        System.out.println("Enviar E-mail.");
    }
}
