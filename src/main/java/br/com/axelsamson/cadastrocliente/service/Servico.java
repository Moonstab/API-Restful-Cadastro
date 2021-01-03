package br.com.axelsamson.cadastrocliente.service;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import br.com.axelsamson.cadastrocliente.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servico {
    @Autowired                  //invocar instancia unica no código = anotação
    CadastroRepository cadastroRepository;
    /*erro solucionado, utilizar mesmo processo de cadastro*/

    Cadastro cadastrar(Cadastro cadastro) throws Exception {
        //funcao de verificar se há um cadastro de email e cpf inserido para evitar repetição
        if (verificaCpf(cadastro.getCpfValido())) {
            throw new Exception("o CPF já está em uso.");
            //se houver um CPF no cadastro imprime Exception = o CPF já consta como cadastrado.

        } else if (verificaEmail(cadastro.getEntradaEmail())) {
            throw new Exception("o email já está em uso.");
        } else {
            return cadastroRepository.save(cadastro);
        }
    }

    public boolean verificaCpf(String cpfValido) {
        Cadastro cadastro = cadastroRepository.findByCpfValido(cpfValido);
        if (cadastro != null) {
            return true;
        }
        return false;//se o nome for nulo, retorna false
    }

    public boolean verificaEmail(String entradaEmail) {
        Cadastro cadastro = cadastroRepository.findByEmailValido(entradaEmail);
        if (cadastro != null) {
            return true;
        }
        return false;
    }
}