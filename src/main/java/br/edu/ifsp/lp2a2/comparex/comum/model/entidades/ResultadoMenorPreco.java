package br.edu.ifsp.lp2a2.comparex.comum.model.entidades;

public class ResultadoMenorPreco {
    private Integer id;
    private Double preco;

    public ResultadoMenorPreco(Integer id, Double preco){
        this.id = id;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }    
}