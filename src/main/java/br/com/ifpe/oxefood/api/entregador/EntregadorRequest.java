package br.com.ifpe.oxefood.api.entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {
  private String nome;
  private String cpf;
  private String RG;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate DTNascimento;

  private String foneCelular;
  private String TDEntregasRealizadas;
  private String foneFixo;
  private String valorPorFrete;
  private String rua;
  private String numero;
  private String bairro;
  private String cidade;
  private String CEP;
  private String UF;
  private String complemento;

  public Entregador build() {

    return Entregador.builder()
        .nome(nome)
        .cpf(cpf)
        .RG(RG)
        .DTNascimento(DTNascimento)
        .foneCelular(foneCelular)
        .TDEntregasRealizadas(TDEntregasRealizadas)
        .foneFixo(foneFixo)
        .valorPorFrete(valorPorFrete)
        .rua(rua)
        .numero(numero)
        .bairro(bairro)
        .cidade(cidade)
        .CEP(CEP)
        .UF(UF)
        .complemento(complemento)
        .build();
  }

}
