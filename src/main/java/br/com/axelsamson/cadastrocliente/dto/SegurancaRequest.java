package br.com.axelsamson.cadastrocliente.dto;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SegurancaRequest {

    @NotBlank // nao permite nulo ou em branco
    private String nome;
    @NotBlank
    private String entradaEmail;
    @NotNull
    private LocalDate dataCadastro;
    @NotBlank
    @CPF
    private String cpfValido;

    public Cadastro moduloNovo(){ //tomodel
        return new Cadastro(this.nome, this.entradaEmail, this.dataCadastro, this.cpfValido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEntradaEmail() {
        return entradaEmail;
    }

    public void setEntradaEmail(String entradaEmail) {
        this.entradaEmail = entradaEmail;
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
