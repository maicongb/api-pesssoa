package pm.apipessoa.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class PessoaModel {

    private Integer codigo;

    private String nome;

    private String nomeAnterior;

    private String rg;

    private String rgOrgaoExpedidor;

    private LocalDate rgDataEmissao;

    private LocalDateTime dataAtualizacao;

    private String cpf;

    private LocalDate dataNascimento;

    private String nomePai;

    private String nomeMae;

    private String pisPasep;

    private LocalDate dataPisPasep;

    private String tituloEleitorNumero;

    private Integer tituloEleitorZona;

    private Integer tituloEleitorSecao;

    private String cnhRegistro;

    private LocalDate cnhDataPrimeira;

}