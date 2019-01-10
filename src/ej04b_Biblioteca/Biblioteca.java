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
public class Biblioteca {
    String bbNombre;
    Libro[] libros ;
    
    Biblioteca(String bn, Libro[] lib ){
        this.bbNombre=bn;
        this.libros=lib;
    }
    
    public Libro Prestar(String isbn, String datosPrestamo){
        //buscar Libro(isbn)
        Libro r=null;
        int i=0;
        while(i<libros.length && libros[i].isbn.compareTo(isbn)!=0){
            i++;
        }
        if(i<libros.length && libros[i].isbn.compareTo(isbn)==0){//lo ha encontrado
            r=libros[i].prestar(datosPrestamo);
        }
        return r;
        
    }
    
   
    
    @Override
    public String toString(){
        String r=this.bbNombre+"\n";
        for (Libro libro : libros) {
            r += libro;
        }
        return r;   
    }
}
