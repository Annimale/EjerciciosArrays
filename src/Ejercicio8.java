/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        
      int []numeros={2,4,5,6,7,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};  
      
      System.out.println("Visualizamos los numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
            
        }
       System.out.println("Indicamos posicion");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i);
        }
       
        System.out.println("Indicamos los que son mayores o iguales que 10");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i]>=10){
                    System.out.println("Numero:  "+numeros[i]+" y esta en la posicion: "+i);
            
                }
        
        }
    
    }
}
