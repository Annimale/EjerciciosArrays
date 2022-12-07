/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        int [] posicion=new int[20];
        int[]numeros={1,2,2,3,4,5,6,7,8,9,10,2,11,12,13,14,12,18,19,20};
        int x;
        for (int i = 0; i < numeros.length; i++) {
            int pos=0;
            for (int j = i+1; j < numeros.length; j++) {//Tenemos que meter un segundo bucle para comparar el valor de j con los de i, es decir que por ejemplo 3 no se repita adelante
                if (numeros[i]==numeros[j]) {
                    posicion [pos]=j;
                    pos++;
                   
                    
                    System.out.println("Se repite este numero: "+" y tiene esta posicion: "+i);
                    //System.out.println("Se repite este numero: "+numeros[j]+" y tiene esta posicion: "+j);

                    
                }
                
            }
            
            System.out.println(posicion[0]+posicion[1]+posicion[2]);
            
           
            
        }
        
    }
    
}
