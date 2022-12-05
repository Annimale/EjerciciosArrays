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
        
    double[] numeros=new double [50];
    for (int i = 0; i < numeros.length; i++) { //CON ESTE BUCLE NOS EVITAMOS TENER QUE ESCRIBIRLOS MANUALMENTE 
            numeros[i]=i+Math.random();
            
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero: "+numeros[i]);
            
        }
}
}
