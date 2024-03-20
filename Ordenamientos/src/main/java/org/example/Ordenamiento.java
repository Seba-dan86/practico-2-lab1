package org.example;
import java.util.*;


public class Ordenamiento {

  int[] datos= new int[1000];

    public Ordenamiento(int[] datos) {
        this.datos = datos;
    }

    public void carga(){
 Random rand = new Random();
 for(int i=0; i<datos.length; i++){
     datos[i] = rand.nextInt(1000);

 }
 public void mostrar(int[]datos){
         System.out.println(Arrays.toString(datos));
     };
 public void bubble(int[]data){
     int num= data.length;
     for(int i=0; i<num-1; i++){
         for(int j=0; j<num-i-1; j++){
             if (datos[j] > datos[j+1]) {
                 // intercambio arr[j+1] y arr[j]
                 int temp = datos[j];
                 datos[j] = datos[j+1];
                 datos[j+1] = temp;
             }
         }
     }

     }

 }
}
