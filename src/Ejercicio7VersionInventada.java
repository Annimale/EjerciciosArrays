/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio7VersionInventada {
    public static void main(String[] args) {
        
        int[] numeros=new int [50];
        int valorMax=0;
        int valorMin=0;
        
        for (int i = 0; i < numeros.length; i++) { //CON ESTE BUCLE NOS EVITAMOS TENER QUE ESCRIBIRLOS MANUALMENTE 
            numeros[i]=i+1;
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>=numeros.length)//Si el numero es mayor o IGUAL que el tope del array lo imprime
                System.out.println("El valor maximo es:  "+numeros[i]);
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==0 ||numeros[i]== 1)//Si el numero es menor o IGUAL que el tope del array lo imprime
                System.out.println("El valor minimo es:  "+numeros[i]);
            
        }
        
                
    }
    
}
