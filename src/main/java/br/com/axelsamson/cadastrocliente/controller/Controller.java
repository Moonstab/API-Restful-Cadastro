package br.com.axelsamson.cadastrocliente.controller;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import br.com.axelsamson.cadastrocliente.dto.SegurancaRequest;
import br.com.axelsamson.cadastrocliente.dto.SegurancaResponse;
import br.com.axelsamson.cadastrocliente.service.Servico;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                             //controlador REST == camada mais externa do sistema
@RequestMapping(value = "/cliente")   //endereço na URL como acessar o controller
public class Controller {

    @PostMapping(value = "/cadastro")
    public ResponseEntity<Cadastro> cadastrar(@RequestBody SegurancaRequest) {

        Cadastro cadastro = SegurancaRequest.moduloNovo;

        //Servico.cadastrar(cadastro);

        SegurancaResponse SegurancaResponse = cadastro.toResponse();
        return (ResponseEntity<Cadastro>) ResponseEntity.status(HttpStatus.OK).body(SegurancaResponse);
        //retorna erro ou sucesso ao gravar dados no banco
    }
}
