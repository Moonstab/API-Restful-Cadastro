package br.com.axelsamson.cadastrocliente.dto;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SegurancaRequest {

    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotNull
    private LocalDate dataCadastro;
    @NotBlank
    @CPF
    private String cpfValido;

    public Cadastro moduloNovo() {
        return new Cadastro(this.nome, this.email, this.dataCadastro, this.cpfValido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntradaEmail() {
        return email;
    }

    public void setEntradaEmail(String entradaEmail) {
        this.email = entradaEmail;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCpfValido() {
        return cpfValido;
    }

    public void setCpfValido(String cpfValido) {
        this.cpfValido = cpfValido;
    }
}
