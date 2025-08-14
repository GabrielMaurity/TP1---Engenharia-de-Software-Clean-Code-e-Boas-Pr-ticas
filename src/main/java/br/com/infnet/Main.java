package br.com.infnet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema...");
        SistemaFinanceiro meuSistema = new SistemaFinanceiro();
        System.out.println("Sistema criado.");

        meuSistema.addcionarConta("Conta de Luz", 150.75);
        meuSistema.addcionarConta("Salário", 5000.00);
        meuSistema.addcionarConta("Internet", 99.90);
        System.out.println("Contas adicionadas.");

        System.out.println("\n--- Gerando primeiro relatório ---");
        meuSistema.gerarRelatorio();

        System.out.println("\n--- Processando pagamentos de taxas ---");
        meuSistema.processarPagamentos(10.00);
        System.out.println("Taxas processadas.");

        System.out.println("\n--- Gerando relatório final ---");
        meuSistema.gerarRelatorio();

        System.out.println("Processador Exercício 2");
        Processador processador = new Processador();
        processador.processar("paralelepipedo");

        System.out.println("Carrinho de Compras Exercício 3");
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarProduto("Saco de arroz", 10.0, 1);
        carrinhoDeCompras.adicionarProduto("Macarrão", 10.0, 2);
        carrinhoDeCompras.calcularTotal();

        System.out.println("Sistema Biblioteca | Exercício 4");
        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
        sistemaBiblioteca.adicionarLivro(true, "avatar");
        sistemaBiblioteca.emprestarLivro("avatar");
        sistemaBiblioteca.emprestarLivro("avatar");
        sistemaBiblioteca.devolverLivro("avatar");
        sistemaBiblioteca.devolverLivro("avatar");
    }
}
