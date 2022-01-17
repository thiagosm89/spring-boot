package packages.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

class PessoaUpdateDTO implements Serializable {

    private String nome;

    private LocalDate dataNascimento;

    private LocalDateTime dataInsercao;

    private Boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDateTime dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaUpdateDTO that = (PessoaUpdateDTO) o;
        return Objects.equals(nome, that.nome) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(dataInsercao, that.dataInsercao) && Objects.equals(ativo, that.ativo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento, dataInsercao, ativo);
    }
}