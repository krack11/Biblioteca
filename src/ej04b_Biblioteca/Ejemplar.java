/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04b_Biblioteca;

/**
 *
 * @author FMR
 */
public class Ejemplar {
    int numEjemplar;
    boolean prestado;       // true = prestado / false= disponible
    String datosPrestamo;   // datos del socio, etcétera
    
    Ejemplar(int nEjemplar){
        this.numEjemplar=nEjemplar;
        prestado=false;
        datosPrestamo="Recien creado";
    }
    
    public boolean disponible(){
        return !prestado;
    }
    
    public void Prestar(String datPres){
        if(!prestado){
            prestado=true;
            datosPrestamo=datPres;
        }
    }
    
    void Devolver(){
        prestado=false;
        datosPrestamo="devuelto"+datosPrestamo;
    }
   
    @Override
    public String toString(){
        String r=this.numEjemplar+"*"+this.prestado+"*"+this.datosPrestamo;
        return r;
    }
}
