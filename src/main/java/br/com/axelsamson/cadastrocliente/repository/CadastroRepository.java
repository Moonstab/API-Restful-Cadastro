package br.com.axelsamson.cadastrocliente.repository;


import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    //funcao extends faz com que a classe
    //CadastroRepository herde os métodos do JPA
    //sem precisar criá-los do zero

    Cadastro findByCpfValido(String cpfValido);
    Cadastro findByEmailValido(String entradaEmail);


    //procura no banco o atributo que tiver na
    //classe CADASTRO neste exemplo será NOME
}
