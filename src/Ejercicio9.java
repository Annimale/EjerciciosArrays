/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        int[]numeros={1,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20,21,22};
        
        
        
        System.out.println("Visualizamos los elementos del array y la posicion de cada uno");
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Numero:  "+numeros[i]+ " , posicion del numero:  "+i);
            
        }
        
        System.out.println("Mayor numero del array");
        for (int i = 0; i <numeros.length; i++) {
            if (i==19) {// Como sabemos que el array es de 0 a 19 siendo 19 la ultima casilla, hacemos que solo imprima ese valor
             System.out.println(numeros[i]);
                System.out.println("Y tiene la posicion: "+i);
            
        }
        
        
        
        
    }
    
}
}
