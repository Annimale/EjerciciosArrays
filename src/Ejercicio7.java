/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
    int contador;
    int[] numeros=new int [50];
    for (int i = 0; i < numeros.length; i++) { //CON ESTE BUCLE NOS EVITAMOS TENER QUE ESCRIBIRLOS MANUALMENTE 
            numeros[i]=(int) (Math.random()*50);
            
        }
    
        System.out.println("Listado de numeros del array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero: "+numeros[i]);
            
        }
        
        System.out.println("*****");
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==0) {
                
                    System.out.println("Hemos encontrado un "+numeros[i]+"   y su posicion es la:  "+i);
                    
            }else{
                System.out.println("No es un cero,es un: "+numeros[i]);
                
            }
            
        }
}
}
