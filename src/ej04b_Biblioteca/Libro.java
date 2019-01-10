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
public class Libro {
    String isbn;
    String titulo;
    String autor;
    int nEjs;
    Ejemplar[] e;
   
    Libro(String isb, String tit, String aut,int nEj){
        this.isbn=isb;
        this.titulo=tit;
        this.autor=aut;
        this.nEjs=nEj;
        this.e = new Ejemplar[nEj];
        for(int i=0; i<e.length;i++){
             this.e[i]=new Ejemplar();
        }
       
    }
    
    public int numEjemplares(){
        return e.length;
    }
    
    public int numEjemplaresDisponibles(){
        int contaDis = 0;
        for( Ejemplar ej :e ){
            if (ej!=null) contaDis++;
                
        }
        return contaDis;
    }
    
    
    public Libro prestar(String datosPres){
        Libro r=null;
        int i=0;
        while( i<e.length && r==null  ){
            if(e[i]!=null && e[i].disponible()){
                e[i].Prestar(datosPres);
                r=this;
            }else{
                i++;
            }
        }
        return r;
    }
    
    
    public void eliminarEjemplar(){
        e[nEjs]=null;
 
    }
    
    
    
    @Override
    public String toString(){
        String r=this.isbn+"*"+this.titulo+"*"+this.autor+
                "*Ejs:"+this.numEjemplares()+"*Disp:"+this.numEjemplaresDisponibles();
        
        for (Ejemplar ej: e){
            r+="\n\t";
            r+=ej;
        }
        r+="\n";
        return r;
    }
}
