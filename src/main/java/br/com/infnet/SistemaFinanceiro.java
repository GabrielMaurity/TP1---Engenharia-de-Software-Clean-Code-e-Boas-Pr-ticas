package br.com.infnet;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    private List<Conta> contas;
    public SistemaFinanceiro() {
        contas = new ArrayList<Conta>();
    }

    public void addcionarConta(String nomeConta, double valorInicial) {
        Conta novaConta = new Conta(nomeConta, valorInicial);
        contas.add(novaConta);
    }

    public void gerarRelatorio() {
        System.out.println("== Relatório Financeiro ===");
        for (Conta conta : this.contas) {
            System.out.println("Conta: " + conta.getNome() + " - Saldo: " + conta.getSaldo());
        }
    }

    public void processarPagamentos(double taxa) {
        for (Conta conta : this.contas) {
            conta.aplicarTaxa(taxa);
        }
    }
}