package caetano.maria.veiculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "VEICULOS")
public class Veiculo {

    @Id
    private String placa;

    private EnumTipoVeiculo enumTipoVeiculo;

    private String nome;

    private Integer anoFabricacao;

    private String cor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "veiculo")
    private List<Multa> multas;

    public Veiculo () { }

    public Veiculo(String placa, EnumTipoVeiculo enumTipoVeiculo, String nome, Integer anoFabricacao, String cor) {
        this.placa = placa;
        this.enumTipoVeiculo = enumTipoVeiculo;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public EnumTipoVeiculo getTipoVeiculo() {
        return enumTipoVeiculo;
    }

    public void setTipoVeiculo(EnumTipoVeiculo enumTipoVeiculo) {
        this.enumTipoVeiculo = enumTipoVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public java.util.List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(java.util.List<Multa> multas) {
        this.multas = multas;
    }
}
