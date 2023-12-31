package br.com.ifpe.oxefood.modelo.entregador;

import java.time.LocalDate;

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
@Table(name = "Entregador")
@Where(clause = "habilitado = true")
public class Entregador extends EntidadeAuditavel {
  @Column
  private String nome;

  @Column
  private String cpf;

  @Column
  private String RG;

  @Column
  private LocalDate DTNascimento;

  @Column
  private String foneCelular;

  @Column
  private String TDEntregasRealizadas;

  @Column
  private String foneFixo;

  @Column
  private String valorPorFrete;

  @Column
  private String rua;

  @Column
  private String numero;

  @Column
  private String bairro;

  @Column
  private String cidade;

  @Column
  private String CEP;

  @Column
  private String UF;

  @Column
  private String complemento;

}
