package packages.dto;

import java.io.Serializable;
import java.time.LocalDate;

class PessoaUpdateDTO implements Serializable {

    private static final long serialVersionUID = 3235935358278375465L;

    private String nome;

    private LocalDate dataNascimento;

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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}