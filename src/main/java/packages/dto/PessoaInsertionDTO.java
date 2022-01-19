package packages.dto;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

import java.io.Serializable;
import java.time.LocalDate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

public class PessoaInsertionDTO implements Serializable {

    private static final long serialVersionUID = 4423020489529237653L;

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty
    private String cpf;

    @NotNull
    @NotEmpty
    private String confirmarCpf;

    @NotNull
    @DateTimeFormat(iso = DATE)
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConfirmarCpf() {
        return confirmarCpf;
    }

    public void setConfirmarCpf(String confirmarCpf) {
        this.confirmarCpf = confirmarCpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
