/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio5 {
    
    
    public static void main(String[] args) {
        int resultado=0;
    
    int[] numeros=new int [50];
    
        for (int i = 0; i < numeros.length; i++) { //CON ESTE BUCLE NOS EVITAMOS TENER QUE ESCRIBIRLOS MANUALMENTE 
            numeros[i]=i+1;
            
        }
        System.out.println("Tenemos un arrray del 1 al 50");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
        System.out.println("**********************");
        System.out.println("Vamos a sumar aquellos que sean pares del vector");
        System.out.println("*************************");
        
        
        
                for (int i = 0; i < numeros.length; i++) {
                    if(numeros[i]%2==0)
                        resultado=numeros[i]+resultado;//LO QUE HACEMOS ES QUE VAYAMOS SUMANDO EL RESULTADO ACUMULADO EN RESULTADO DE SOLO LOS PARES
            
        }
                System.out.println("La suma de todos los pares es:  "+resultado);
        
        
}
    
}
