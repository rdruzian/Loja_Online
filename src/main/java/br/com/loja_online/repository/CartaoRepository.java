package br.com.loja_online.repository;

import br.com.loja_online.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Integer> {
    Optional<Cartao> findById(Integer id);
}
