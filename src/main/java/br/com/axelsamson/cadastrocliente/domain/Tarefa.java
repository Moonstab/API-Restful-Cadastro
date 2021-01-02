package br.com.axelsamson.cadastrocliente.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Tarefa {
    //a declaracao private determina que as entidades privadas para poder preservar cada uma
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //a id será gerada randomicamente devido a anotação generatedValue
    @NotBlank // nao permite nulo ou em branco
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
    private LocalDate dataCadastro;

    public Tarefa(String nome, String descricao, LocalDate dataCadastro) { //metodo de ordem de atributos
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    @Deprecated //metodo depreciado para nao ser usado
    public Tarefa() {

    }

    public long getId() {
        return id;
    }
        //GETters e SETters abaixo (utilizar o GENERATE)
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
