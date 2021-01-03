package br.com.axelsamson.cadastrocliente.domain;

import br.com.axelsamson.cadastrocliente.dto.SegurancaResponse;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Cadastro {
    //a declaracao private determina que as entidades privadas para poder preservar cada uma
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //a id será gerada randomicamente devido a anotação generatedValue
    @NotBlank
    private String nome;
    @NotBlank
    private String entradaEmail;
    @NotNull
    private LocalDate dataCadastro;
    @NotBlank
    @CPF
    private String cpfValido;

    public Cadastro(String nome, String entradaEmail, LocalDate dataCadastro, String cpfValido) {
        this.nome = nome;
        this.entradaEmail = entradaEmail;
        this.dataCadastro = dataCadastro;
        this.cpfValido = cpfValido;
    }

    @Deprecated
    public Cadastro() {

    }

    public long getId() {
        return id;
    }
        //GETters e SETters abaixo (utilizar o GENERATE)

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

    public SegurancaResponse toResponse(){
        return new SegurancaResponse(this.id, this.nome);
    }
}
