/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        
        int[] vectorV={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
        int[] vectorP= new int[vectorV.length];
        
        System.out.println("Visualizamos valores del vector V");
        for (int i = 0; i < vectorV.length; i++) {
            System.out.println(vectorV[i]);
            
        }
        
        System.out.println("Vamos a asignarle los valores de vector V a vector P, pero en cada posición ha de sumarse el anterior");
        
        
        for (int i = 0; i < vectorP.length; i++) {
            for (int j = 0; j <=i; j++) {// NECESITAMOS UN SEGUNDO BUCLE PARA RECORRER LOS VALORES ANTERIORES A i Y ASI ASIGNARSELOS A vectorP[i] junto a la suma de los recorridos/ anteriores y LUEGO
                //FUERA DEK BUCLE IMPRIMIMOS LOS VALORES, SI LO HICESEMOS DENTRO NOS REPETIRIA EL PROCESO DE CADA SUMA Y COMO RECORRE LOS VALORES
             vectorP[i]=vectorV[j]+vectorP[i];// vectorV{[j] tiene el valor de la posicion J del vector V, es decir si j es 10 tendrá valor 9, entonces vectorP[i] tendrá todos los numeros acumulados sumados hasta j y luego imprimimos esa suma acumulada
             
            }
            System.out.println(vectorP[i]);//SUMA ACUMULADA 
        }
        
        
        
    }
    
}
