package br.com.axelsamson.cadastrocliente.controller;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import br.com.axelsamson.cadastrocliente.dto.SegurancaRequest;
import br.com.axelsamson.cadastrocliente.dto.SegurancaResponse;
import br.com.axelsamson.cadastrocliente.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController                             //controlador REST == camada mais externa do sistema
@RequestMapping(value = "/cliente")   //endereço na URL como acessar o controller
public class Controller {

    @Autowired //injetar serviços da classe SERVICO
    Servico service;

    @PostMapping(value = "/cadastro") //corpo enviado pelo JSON vai para SEGURANÇAREQUEST
    public ResponseEntity<SegurancaResponse> cadastrar(@RequestBody SegurancaRequest segurancaRequest) throws Exception {
        Cadastro cadastro = segurancaRequest.moduloNovo(); //requeste para cadastro
        service.cadastrar(cadastro);                      //METODO cadastrar dentro do service
        SegurancaResponse segurancaResponse = cadastro.toResponse();//cadastro para response

        return ResponseEntity.status(HttpStatus.OK).body(segurancaResponse);
    }

}
