package br.com.infnet;

public class Produto {
    public String nomeProduto;
    public double preco;
    public Integer quantidade;

    public Produto(String nomeProduto, double preco, Integer quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public double getPreco(){
        return preco;
    }
    public Integer getQuantidade(){
        return quantidade;
    }
    public double calcularSubtotal() {
        return this.preco * this.quantidade;
    }
}
