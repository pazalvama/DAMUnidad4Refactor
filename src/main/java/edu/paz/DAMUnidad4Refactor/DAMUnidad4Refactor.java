/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.paz.DAMUnidad4Refactor;

/**
 * 
 * @author Paz
 * @version 1.0
 * @since 6/2/2024
 * 
 */

public class DAMUnidad4Refactor {
    public static void main(String[] args) {
        Libro objetoLibro =new Libro ("El Hereje", "Miguel Delibre", 324);
        Persona objetoPersona = new Persona("Pedro", 2);
        Informar[] miArray = new Informar[4];
        miArray[0] = objetoLibro;
        miArray[1] = objetoPersona;
        miArray[2] = new Libro ("Nubosidad variable", "Carmen Martín Gaite", 420);
        miArray[3] = new Persona("Rocío",4);
        int i;
        for(i = 0; i < miArray.length;i++){
            miArray[i].informa();
        }
        System.out.println("Modificación de mi proyecto");
        System.out.println("Versión siguiente");
    }
}