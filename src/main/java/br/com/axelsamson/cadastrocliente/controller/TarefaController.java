package br.com.axelsamson.cadastrocliente.controller;

import br.com.axelsamson.cadastrocliente.domain.Tarefa;
import br.com.axelsamson.cadastrocliente.dto.SegurancaRequest;
import br.com.axelsamson.cadastrocliente.dto.SegurancaResponse;
import br.com.axelsamson.cadastrocliente.service.TarefaServico;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                             //controlador REST == camada mais externa do sistema
@RequestMapping(value = "/api/tarefa")   //endereço na URL como acessar o controller
public class TarefaController {

    //mecanismo do CRUD
    //criar uma tarefa
    @PostMapping
    public ResponseEntity<Tarefa> cadastrar(@RequestBody SegurancaRequest) {
        //metodo de CADASTRAR vai buscar a classe no DTO
        /*erro solucionado: não usar a entidade devido a exposição de dados sensíveis = criar DTO*/
        Tarefa cadastro = SegurancaResponse.moduloNovo;
        //criar o objeto para linkar com método criado no DTO
        // e receber os dados de acordo com o modulo no DTO


        TarefaServico.criar(cadastro);
        SegurancaResponse SegurancaResponse = cadastro.toResponse();
        return ResponseEntity.status(HttpStatus.OK).body(SegurancaResponse);
        //retorna erro ou sucesso ao gravar dados no banco
    }
}
