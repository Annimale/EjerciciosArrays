/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        int []numeros={0,1,2,3,4,5,6,7,8,9};
        int  pospar=0;
        int posimpar=1;
        System.out.println("Numeros pares");
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){// CONDICION PARA QUE SEA PAR
                System.out.println(numeros[i]);
                //System.out.println(numeros[i]-1);
                System.out.println("Posicion en el array del "+numeros[i]+ "  es  "+pospar);// LO QUE HACEMOS PARA SABER LA POSICION ES CREAR UNA VARIABLE QUE PARTA DESDE 0 Y VAMOS SUMANDO DOS YA QUE 
                //VA DE PAR EN PAR POR LO QUE VA SUMANDO DE DOS EN DOS Y VA IMPRIMIENDO LA POSICION DE LOS PARES
                pospar+=2;
        }
    }
        System.out.println("**************************");
        System.out.println("Numeros impares");
         for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2!=0){//CONDICION PARA QUE SEA IMPAR
                System.out.println(numeros[i]);
                System.out.println("Posicion en el array del "+numeros[i]+ "  es  "+posimpar);
                posimpar+=2;
    
            }
         }
    }
}
