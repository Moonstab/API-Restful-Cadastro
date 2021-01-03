package br.com.axelsamson.cadastrocliente.service;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import br.com.axelsamson.cadastrocliente.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.swing.*;

@Service                        //anotação avisa ao SPRING que a classe é de serviço (não esquecer)
public class Servico {
    @Autowired                  //invocar instancia unica no código = anotação
    CadastroRepository cadastroRepository;//trouxe a função do repository para o service
    /*erro solucionado, utilizar mesmo processo de TAREFA tipo CRUD*/


    //CriarTarefa = cadastro para cadastro(criar) para se add no banco
    public Cadastro cadastrar(Cadastro cadastro) {

        if (existeNome(cadastro.getNome())){
            //funcao de verificar se há um cadastro com o nome inserido
            //(essa funcao utiliza o codigo abaixo de
            throw new Exception("o nome já está cadastrado.")
            //se houver um nome no cadastro
            //ele irá imprimir a msg do
            // Exception = o nome jpa está cadastrado.
        }
        return cadastroRepository.save(cadastro);

        //.save = metodo herdado pelo extends em REPOSITORY
        //função do repository para salvar o objeto cadastro
        //e retorna uma cadastro(valor do objeto)

    }
    public boolean existeNome(String nome){
        Cadastro cadastro = cadastroRepository.findByNome(nome); //busca cadastro pelo nome
        if (cadastro != null){ //se o nome for diferente de nulo, retorna true
            return true;
        }
        return false;//se o nome for nulo, retorna false
    }

}
