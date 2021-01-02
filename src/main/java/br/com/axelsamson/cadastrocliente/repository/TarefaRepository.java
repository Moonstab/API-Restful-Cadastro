package br.com.axelsamson.cadastrocliente.repository;


import br.com.axelsamson.cadastrocliente.domain.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
        //funcao extends faz com que a classe
        // TarefaRepository herde os métodos do JPA
        //sem precisar criá-los do zero
//extendes faz com que TarefaRepository
//herde os metodos do JpaRepository               //lembrar que <Entidade, tipo de variável de ID>
}
