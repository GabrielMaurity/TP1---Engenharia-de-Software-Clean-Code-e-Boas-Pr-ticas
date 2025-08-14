package br.com.infnet;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    private List<Livro> livros;

    public SistemaBiblioteca() {
        livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(boolean disponibilidade, String titulo) {
        Livro livro = new Livro(disponibilidade, titulo);
        livros.add(livro);
    }

    private Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(String titulo) {
        Livro livroEncontrado = buscarLivroPorTitulo(titulo);
        if (livroEncontrado != null) {
            livroEncontrado.emprestar();
        } else {
            System.out.println("Livro com o título '" + titulo + "' não encontrado no sistema.");
        }
    }

    public void devolverLivro(String titulo) {
       Livro livroEncontrado = buscarLivroPorTitulo(titulo);
       if (livroEncontrado != null) {
           livroEncontrado.devolver();
       } else {
           System.out.println("Livro com o título '" + titulo + "' não encontrado no sistema.");
       }
    }
}
