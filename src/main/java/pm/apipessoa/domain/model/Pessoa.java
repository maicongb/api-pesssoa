package pm.apipessoa.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pessoa  {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pes_Codigo")
    private Long codigo;

    @Column(name = "pes_Nome")
    private String nome;

    @Column(name = "pes_NomeAnterior")
    private String nomeAnterior;

    @Column(name = "pes_RG")
    private String rg;

    @Column(name = "pes_RGOrgaoExpedidor")
    private String rgOrgaoExpedidor;

    @Column(name = "pes_RGDtEmissao")
    private LocalDate rgDataEmissao;

    @Column(name = "pes_DtAtualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "pes_CPF")
    private String cpf;

    @Column(name = "pes_DtNascimento")
    private LocalDate dataNascimento;

    @Column(name = "pes_NomePai")
    private String nomePai;

    @Column(name = "pes_NomeMae")
    private String nomeMae;

    @Column(name = "pes_PISPASEP")
    private String pisPasep;

    @Column(name = "pes_DtPISPASEP")
    private LocalDate dataPisPasep;

    @Column(name = "pes_TituloEleitorNr")
    private String tituloEleitorNumero;

    @Column(name = "pes_TituloEleitorZona")
    private Integer tituloEleitorZona;

    @Column(name = "pes_TituloEleitorSecao")
    private Integer tituloEleitorSecao;

    @Column(name = "pes_CNHRegistro")
    private String cnhRegistro;

    @Column(name = "pes_CNHDtPrimeira")
    private LocalDate cnhDataPrimeira;

}

