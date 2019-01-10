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
        
        Libro arrLib[]= {new Libro("123","Quijote","Cervantes",4),
                        new Libro("234","La colmena","Cela",5),
                        new Libro("345","Fausto","Goethe",8),
                        new Libro("567","Odisea", "Homero",3),
                        new Libro("678","La Regenta", "Clarin",7)};  
        
        Biblioteca b1=new Biblioteca(  "Biblioteca Municipal de Pozuelo", arrLib);
        
        Libro lp=b1.Prestar("234", "i do not asociate with niggers");
        System.out.println(lp);
        lp= b1.Prestar("234", "Prestado otra vez nigger");
        
        System.out.println(b1);
    }
}
