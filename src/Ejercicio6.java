/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        
        int []numeros={10,8,7,5,2,3,4,5,1,25};
        
        
        System.out.println("Imprimimos los valores del vector");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
        System.out.println("****");
        System.out.println("Imprimimos y decimos posicion de los numeros pares");//SOLO TE IMPRIME LOS NUMEROS PARES QUE TIENEN POSCIÓN PAR
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                if(i%2==0){
                System.out.println("Numero par:  "+numeros[i]);
                System.out.println("Posicion de los pares:  "+i);
                
                
            }
            }
        }
        System.out.println("****");
        System.out.println("Imprimimos y decimos posicion de los numeros multiplos de 3");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%3==0) {
                if(i%2!=0){
                System.out.println("Multiplo de 3:  "+numeros[i]);
                System.out.println("Posicion de los impares:  "+i);
                
            }
            }
    }
    }
}
