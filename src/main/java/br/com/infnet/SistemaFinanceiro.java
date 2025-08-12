package br.com.infnet;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    private List contas;
    private List valores;
    public SistemaFinanceiro() {
        contas = new ArrayList<>();
        valores = new ArrayList<>();
    }

    public void addcionarConta(String conta, double valor) {
        contas.add(conta);
        valores.add(valor);
    }

    public void gerarRelatorio() {
        System.out.println("== Relatório Financeiro ===");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta: " + contas.get(i) + " - Saldo: " + valores.get(i));
        }
    }

    public void processarPagamentos(double taxa) {
        for (int i = 0; i < valores.size(); i++) {
            valores.set(i, valores.get(i) - taxa);
        }
    }
}