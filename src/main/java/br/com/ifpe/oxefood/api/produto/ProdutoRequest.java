package br.com.ifpe.oxefood.api.produto;

import br.com.ifpe.oxefood.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {
    private String titulo;

    private String codigo;

    private String descricao;

    private double valorUnitario;

    private String tempoEntregaMinimoEmMinutos;

    private String tempoEntregaMaximoEmMinutos;

    public Produto build() {

        return Produto.builder()
                .titulo(titulo)
                .codigo(codigo)
                .descricao(descricao)
                .valorUnitario(valorUnitario)
                .tempoEntregaMinimoEmMinutos(tempoEntregaMinimoEmMinutos)
                .tempoEntregaMaximoEmMinutos(tempoEntregaMaximoEmMinutos)
                .build();
    }
}
