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
    int proximoEjemplar=1;
   
    Libro(String isb, String tit, String aut,int nEj){
        this.isbn=isb;
        this.titulo=tit;
        this.autor=aut;
        this.nEjs=nEj;
        this.e = new Ejemplar[nEj];
        for(int i=0; i<e.length;i++){
             this.e[i]=new Ejemplar(proximoEjemplar);
             proximoEjemplar++;
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
                e[i].Prestar("Ejemplar: " +e[i].numEjemplar+"*"+datosPres);
                r=this;
            }else{
                i++;
            }
        }
        return r;
    }
    
    public Ejemplar buscarEjemplar(int nEjemplar){
        Ejemplar r=null;
        int i=0;
        while(i<e.length && e[i].numEjemplar!=nEjemplar){
            i++;
        }
        if(i<e.length) {
        r=e[i];
        }
        return r;
    }
    
        public int buscarIndiceEjemplar(int nEjemplar){
        int i=0;
        while(i<e.length && e[i].numEjemplar!=nEjemplar){
            i++;
        }
        if(i==e.length) {
        i=-1;
        }
        return i;
    }
    
    
    public void devolver(int nEjemplar){
        
        Ejemplar r=this.buscarEjemplar(nEjemplar);
        
        if(r!=null)r.Devolver();
        
    }
    
    
    public void eliminarEjemplar(int nEjemplar){
        int indice=this.buscarIndiceEjemplar(nEjemplar);
        e[indice]=null;
        
        Ejemplar[] dummy = new Ejemplar[e.length-1];
        int j=0;
        for(int i=0;i<e.length;i++){
            if(e[i] !=null){
                dummy[i]=e[i];
            j++;
            }
        }
        e=dummy;
 
    }
    
    
    public void aniadirEjemplar(){
        Ejemplar[] dummy = new Ejemplar[e.length+1];
        for(int i=0;i<e.length;i++){
            dummy[i]=e[i];
        }
        dummy[e.length]=new Ejemplar(proximoEjemplar);
        proximoEjemplar++;
        e=dummy;
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
