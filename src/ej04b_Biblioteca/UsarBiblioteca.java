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
public class UsarBiblioteca {
    
    public static void main(String[] args){
        
        Libro arrLib[]= {new Libro("123","Quijote","Cervantes",3),
                        new Libro("234","La colmena","Cela",1),
                        new Libro("345","Fausto","Goethe",5),
                        new Libro("567","Odisea", "Homero",2),
                        new Libro("678","La Regenta", "Clarin",4)};  
        
        Biblioteca b1=new Biblioteca(  "Biblioteca Municipal de Pozuelo", arrLib);
        
        Libro lp=b1.Prestar("234", "i do not asociate with niggers");
        System.out.println(lp);
        lp= b1.Prestar("345", "Prestado tambien");
        lp=b1.Prestar("345", "Otro prestado tambien");
        System.out.println(lp);
        System.out.println(b1);
        b1.devolver("234", 0);
        b1.devolver("345", 1);
        b1.aniadirEjemplar("678");
        
        System.out.println(b1);
        
        Biblioteca b2=new Biblioteca("Biblioteca Trotula de Salerno");
        b2.aniadirLibro(new Libro("567","Odisea","Homero",4));
        b2.eliminarEjemplar("567", 3);
        b2.aniadirEjemplar("567");
        System.out.println(b2);
    }
}
