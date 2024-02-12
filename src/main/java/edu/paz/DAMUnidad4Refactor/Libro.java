/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.paz.DAMUnidad4Refactor;
/**
 *
 * @author Paz
 * @version 1.0
 * 
 */
public class Libro implements Informar{
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        titulo="XXXXXXXXXXX";
        autor="aaaaaaaaa";
        paginas=100;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    /**
     * @param 
     * @return 
     */
    void mostrarDatos(){
        System.out.println("El título del libro es " + titulo);
        System.out.println("El autor del libro es " + autor);
        System.out.println("Tiene " + paginas + " páginas");
    }
    
    @Override
    public void informa(){
        System.out.println("Soy un objeto de la clase Libro");
        mostrarDatos();
    }
}
