/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.paz.DAMUnidad4Refactor;

/**
 *
 * @author Paz
 */
public class Persona implements Informar{
    private String nombre;
    private int numeroHermanos;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int numeroHermanos) {
        this.nombre = nombre;
        this.numeroHermanos = numeroHermanos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroHermanos() {
        return numeroHermanos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHermanos(int numeroHermanos) {
        this.numeroHermanos = numeroHermanos;
    }

    public static void setImporteMatricula(int importeMatricula) {
    }

    /**
     *
     */
    @Override
    public void informa(){
        System.out.println("Soy un objeto de tipo Alumno");
        System.out.println("Mi nombre es " + nombre);
        System.out.println("El numero de hermanos es " + numeroHermanos);
    }
}
