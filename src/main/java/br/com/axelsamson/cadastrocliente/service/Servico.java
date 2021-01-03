package br.com.axelsamson.cadastrocliente.service;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import br.com.axelsamson.cadastrocliente.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servico {
    @Autowired                  //invocar instancia unica no código = anotação
    CadastroRepository cadastroRepository;

    public Cadastro buscar(Long id) {
        return cadastroRepository.findById(id).get();
    }


    public Cadastro cadastrar(Cadastro cadastro) throws Exception {
        if (verificaCpf(cadastro.getCpfValido())) {
            throw new Exception("o CPF já está em uso.");
            //se houver um CPF no cadastro imprime Exception = o CPF já consta como cadastrado.

        } else if (verificaEmail(cadastro.getEmail())) {
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
        Cadastro cadastro = cadastroRepository.findByEmail(entradaEmail);
        if (cadastro != null) {
            return true;
        }
        return false;
    }
}