/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        
        int[] vector1={0,1,2,3,4,5,6,7,8,9};
        int[] vector2=new int [vector1.length];
        
        System.out.println("Visualizamos el valor del primer vector");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
            
        }
        
        System.out.println("Asignamos los valores del vector 1 al vector 2");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]=vector1[i];
            
        }
        System.out.println("Imprimimos los valores de Vector 2 pero a la inversa");
        for (int i = vector2.length-1; i >= 0; i--) {//COMO 9 ES MAYOR QUE CERO EL BUCLE SE VA A IR REPETIENDO DISMINUYENDO EN 1 HASTA QUE i SEA = 0 Y TENEMOS QUE PONER vector2.length -1 PORQUE sino cogeria la posicion 10 y va desde 0 hasta 9 no de 0 hasta 10
            System.out.println(vector2[i]);
            
        }
           
           
            
        }
        
        
        
    }


