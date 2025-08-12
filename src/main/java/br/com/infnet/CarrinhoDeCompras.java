package br.com.infnet;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
       produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(String tituloProduto, double preco, int quantidade) {
        Produto produto = new Produto(tituloProduto, preco, quantidade);
        produtos.add(produto);
    }

    public void calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.calcularSubtotal();
        }
        System.out.println("Total da compra: R$ " + total);
    }
}
