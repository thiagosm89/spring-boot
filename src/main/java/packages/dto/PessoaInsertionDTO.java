package packages.dto;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

import java.io.Serializable;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import packages.validation.GeneralValidations;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@GeneralValidations(first = "cpf", second = "confirmarCpf", message = "O campo confirmaCpf deve ser igual ao campo cpf")
public class PessoaInsertionDTO implements Serializable {

    private static final long serialVersionUID = 4423020489529237653L;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo nome.")
    @NotEmpty(message = "Campo obrigatório não informado. Favor informar o campo nome.")
    private String nome;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo cpf.")
    @NotEmpty(message = "Campo obrigatório não informado. Favor informar o campo cpf.")
    private String cpf;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo confirmarCpf.")
    @NotEmpty(message = "Campo obrigatório não informado. Favor informar o campo confirmarCpf.")
    private String confirmarCpf;

    @NotNull(message = "Campo obrigatório não informado. Favor informar o campo dataNascimento.")
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
