package br.com.infnet;


public class Processador {
    public void processar(String dado) {
        if (isDadoInvalido(dado)) {
            System.out.println("Dado Invalido");
            return;
        }
        if (isComprimentoValido(dado)) {
            System.out.println("Dado muito curto");
            return;
        }
        processarDadoValido(dado);
    }
    private boolean isComprimentoValido(String dado) {
        return dado.length() <= 10;
    }
    private boolean isDadoInvalido(String dado) {
        return dado == null || dado.isEmpty();
    }
    private void processarDadoValido(String dado) {
            System.out.println("Dado Válido: " + dado);
    }
}


