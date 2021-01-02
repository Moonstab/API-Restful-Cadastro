package br.com.axelsamson.cadastrocliente.service;

import br.com.axelsamson.cadastrocliente.domain.Tarefa;
import br.com.axelsamson.cadastrocliente.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service                        //anotação avisa ao SPRING que a classe é de serviço (não esquecer)
public class TarefaServico {
    @Autowired                  //invocar instancia unica no código = anotação
    TarefaRepository tarefaRepository;//trouxe a função do repository para o service
    /*erro solucionado, utilizar mesmo processo de TAREFA tipo CRUD*/


    //CriarTarefa = cadastro para cadastro(criar) para se add no banco
    public Tarefa criar(Tarefa cadastro) {
        tarefaRepository.save(cadastro); //.save = metodo herdado pelo extends em REPOSITORY
        return cadastro;

        //função do repository para salvar o objeto cadastro
        //e retorna uma cadastro(valor do objeto)
    }

}
