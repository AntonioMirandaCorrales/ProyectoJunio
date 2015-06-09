/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Antonio Miranda
 */
public class Generos {
    
    //Inicialización del vector donde vamos a guardar los géneros de los juegos
    private String[] generos=
    {"Acción","Aventura","Casual","Conducción","Deportes",
    "Estrategia","MMO","Rol","Simulación","Otros"};
    
    /* Método que devuelve una variable string muestra los elementos
    ordenados por números del vector "generos"*/
    public String devolucionGeneros(){
        String generosStr="";
        for(int i=0; i<generos.length; i++){
            generosStr+=(i+1) + ") " + generos[i] + "\n";
        }
        return generosStr;
    }
    
    /*Método que intercambia lo que contiene un elemento del vector por otro
    mediante unos parametros de entradas*/
    public void mover(int posMover,int posReempl){
         String mover=generos[posReempl-1];
         generos[posReempl-1]=generos[posMover-1];
         generos[posMover-1]=mover;    
    }
    /*Método que devuelve un Boolean dependiendo de si la posición del elemento que
    queremos intercambiar con el metodo "public void mover()" es correcta o incorrecta*/
    public boolean isPos(int pos){
        System.out.println(generos.length);
      if(pos>=0 && pos<=generos.length)
          return true;
      else
          return false;
      
    } 
}
