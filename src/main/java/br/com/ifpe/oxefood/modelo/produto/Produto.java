package br.com.ifpe.oxefood.modelo.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Produto")
@Where(clause = "habilitado = true")
public class Produto extends EntidadeAuditavel {
    @Column
    private String titulo;
    @Column
    private String codigo;
    @Column
    private String descricao;
    @Column
    private double valorUnitario;
    @Column
    private String tempoEntregaMinimoEmMinutos;
    @Column
    private String tempoEntregaMaximoEmMinutos;

}
