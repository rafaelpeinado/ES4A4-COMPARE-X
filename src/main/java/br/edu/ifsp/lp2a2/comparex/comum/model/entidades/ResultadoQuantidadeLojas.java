package br.edu.ifsp.lp2a2.comparex.comum.model.entidades;

public class ResultadoQuantidadeLojas {
    private Integer id;
    private Integer quantidade;

    public ResultadoQuantidadeLojas(Integer id, Integer quantidade){
        this.id = id;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}