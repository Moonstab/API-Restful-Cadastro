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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotNull
    private LocalDate dataCadastro;
    @NotBlank
    @CPF
    private String cpfValido;

    public Cadastro(String nome, String email, LocalDate dataCadastro, String cpfValido) {
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.cpfValido = cpfValido;
    }

    @Deprecated
    public Cadastro() {
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String entradaEmail) {
        this.email = email;
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

    public SegurancaResponse toResponse() {
        return new SegurancaResponse(this.id, this.nome);
    }
}
