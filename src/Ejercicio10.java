/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        int [] repetidos=new int[20];
        int[]numeros={1,2,3,2,4,12,6,7,2,9,10,2,11,12,13,14,20,18,19,20};
        
        for (int i = 0; i < numeros.length; i++) {
            int pos=0;
            for (int j= i+1; j < numeros.length; j++) {
            //for (int j = i+1; j < numeros.length; j++) {//Tenemos que meter un segundo bucle para comparar el valor de j con los de i, es decir que por ejemplo 3 no se repita adelante
                if ((i!=j) &&(numeros[i]==numeros[j])) {
                    repetidos [j] = numeros[j];
                    //posicion [pos]=j;
                    //pos++;
                   
                    
                    //System.out.println("El numero: "+numeros[i]+" se repite con otro que se encuentra en la posicion: "+j);
                    //System.out.println("Se repite este numero: "+numeros[j]+" y tiene esta posicion: "+j);
                }
                
            }
            /*System.out.println("Visualizamos el valor del vector repetidos");
                for (int m = 0; m < repetidos.length; m++) {
                System.out.println(repetidos[m]);
            }*/
            for(int k=0;k < repetidos.length;k++){
                if ((repetidos[k]!=0))
                    System.out.println("El numero: "+repetidos[k]+" se repite con otro que se encuentra en la posicion: "+k);
                    
            }
            /*
                /*System.out.println("Visualizamos el valor del primer vector");
                for (int l = 0; l < repetidos.length; l++) {
                System.out.println(repetidos[i]);
                }*/
            for(int k=0;k < repetidos.length;k++){
                repetidos[k] = 0;
                }    
            }
            
            
            
           
            
        }
        
    }
    

