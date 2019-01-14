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
    
    Biblioteca(String bn){
        this(bn, null);
    }
    
    public Libro Prestar(String isbn, String datosPrestamo){
        //buscar Libro(isbn)
        Libro r=buscar(isbn);
        if(r!=null){
            r=r.prestar(datosPrestamo);
        }
        return r;
        
    }
    
    
    public Libro devolver(String isbn,int ejemplar){
        Libro r=buscar(isbn);
        if(r!=null){
            r.devolver(ejemplar);
        }
        return r;
    }
    
        public void aniadirEjemplar(String isbn){
        Libro r= buscar(isbn);
        if(r!=null){
            r.aniadirEjemplar();
        }
    }
    
    public Libro buscar(String isbn){
        Libro r=null;
        int i=0;
        while(i<libros.length && libros[i].isbn.compareTo(isbn)!=0){
            i++;
        }
        if(i<libros.length && libros[i].isbn.compareTo(isbn)==0){//lo ha encontrado
            r=libros[i];
    }
        return r;
    }
    
    public void aniadirLibro(Libro nuevoLibro){
        Libro[] dummy;
        if(libros!=null){
            dummy = new Libro[libros.length+1];
        for(int i=0;i<libros.length;i++){
            dummy[i]=libros[i];
        }
        }else{
           dummy= new Libro[1];
        }
        dummy[dummy.length-1]=nuevoLibro;
        libros=dummy;
        
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
