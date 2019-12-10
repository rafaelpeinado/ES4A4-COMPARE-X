package br.edu.ifsp.lp2a2.comparex.comum.model.entidades;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRespository extends CrudRepository<Produto, Integer> {
    // É assim que se faz uma query se for necessário
    // @Query("SELECT p FROM Produto p ORDER BY pontuacao DESC")
    // Iterable<Produto> findByPontuacaoOrder();
    List<Produto> findByNomeContaining(String nome);
    
    /*@Query("SELECT p FROM Produto p join fetch p.lojasProdutos c WHERE p.nome LIKE %?1%")
    List<Produto> findByNomeContaining(String nome);*/
}
