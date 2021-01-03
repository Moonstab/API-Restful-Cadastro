package br.com.axelsamson.cadastrocliente.dto;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class SegurancaRequest {
    public static Cadastro moduloNovo;
    @NotBlank // nao permite nulo ou em branco
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
    private LocalDate dataCadast;

        //não esquecer de nunca colocar o id porque ele já gera sozinho ou isso vai dar erro novamente
        /*criar o método dentro do dto pra n dar erro na hora de pedir o método dentro do Controller*/

    public Cadastro moduloNovo(this.nome, this.descricao, this.dataCadast) { //metodo do DTO
    }


    //nunca esquecer de criar sempre os GET e SET do codigo ou o dto vai falhar
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

    public LocalDate getDataCadast() {
        return dataCadast;
    }

    public void setDataCadast(LocalDate dataCadast) {
        this.dataCadast = dataCadast;
    }
}
