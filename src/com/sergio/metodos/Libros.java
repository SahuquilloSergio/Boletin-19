package com.sergio.metodos;

public class Libros {

    String titulo;
    String autor;
    String isbn;
    float prezo;
    int nunidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String isbn, float prezo, int nunidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.nunidades = nunidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNunidades() {
        return nunidades;
    }

    public void setNunidades(int nunidades) {
        this.nunidades = nunidades;
    }

    @Override
    public String toString() {
        return "titulo= " + titulo + "\n autor=" + autor + "\n isbn=" + isbn + "\n prezo=" + prezo + "\n nunidades=" + nunidades;
    }

    
}
