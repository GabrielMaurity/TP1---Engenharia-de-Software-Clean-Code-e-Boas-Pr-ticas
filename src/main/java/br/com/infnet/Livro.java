package br.com.infnet;

public class Livro {
    private boolean disponivel;
    private String titulo;

    public Livro(boolean disponibilidade, String titulo) {
        this.disponivel = disponibilidade;
        this.titulo = titulo;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public boolean getDisponibilidade(){
        return disponivel;
    }

    public String getTitulo(){
        return titulo;
    }

    public void emprestar() {
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("Desculpe, o livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println("Atenção: este livro já constava como disponível.");
        }
    }
}
