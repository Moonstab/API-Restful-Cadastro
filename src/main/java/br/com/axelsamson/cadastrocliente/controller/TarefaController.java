package br.com.axelsamson.cadastrocliente.controller;

import br.com.axelsamson.cadastrocliente.domain.Tarefa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//controlador REST == camada mais externa do sistema
@RequestMapping(value = "/api/tarefa") //endereço na URL como acessar o controller

public class TarefaController {
    public static void main(String[] args) {
        //mecanismo do CRUD
        //criar uma tarefa
        public ResponseEntity<Tarefa> cadastrar () {
            return ResponseEntity.status(HttpStatus.OK).body("Cadastro Registrado")

        }

        //busca uma tarefa

        //atualiza uma tarefa

        //deleta uma tarefa


    }
}
