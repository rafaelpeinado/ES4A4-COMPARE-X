package br.edu.ifsp.lp2a2.comparex.comum.model.entidades;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LojasProdutosRepository extends CrudRepository<LojaProduto, Integer>{
    @Query("select new br.edu.ifsp.lp2a2.comparex.comum.model.entidades.ResultadoQuantidadeLojas(lp.idProduto, max(lp.idLoja)) from LojaProduto lp group by lp.idProduto")
    List<ResultadoQuantidadeLojas> quantidadeLojas();

    @Query("select new br.edu.ifsp.lp2a2.comparex.comum.model.entidades.ResultadoMenorPreco(lp.idProduto, min(lp.preco)) from LojaProduto lp group by lp.idProduto")
    List<ResultadoMenorPreco> menorPreco();

    
}
