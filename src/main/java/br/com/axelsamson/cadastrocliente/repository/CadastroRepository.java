package br.com.axelsamson.cadastrocliente.repository;

import br.com.axelsamson.cadastrocliente.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    Cadastro findByCpfValido(String cpfValido);
    Cadastro findByEmail(String entradaEmail);
}
