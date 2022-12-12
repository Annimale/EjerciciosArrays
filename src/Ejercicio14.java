/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        
         int[] vectorV={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
         int[] vectorP= new int[vectorV.length];
         
         System.out.println("Visualizamos contenido vector V");
         for (int i = 0; i < vectorV.length; i++) {
             System.out.println(vectorV[i]);
            
        }
         
         System.out.println("Visualizamos contenido de Vector P con los valores pares de contenido V");
         for (int i = 0; i < vectorP.length; i++) {
                 vectorP[i]=vectorV[i];//PRIMERO ASIGNAMOS LOS VALROES Y LUEGO PONEMOS LA CONDICIÓN
                 if (vectorV[i]%2==0) {
                     System.out.println(vectorP[i]);
                 }else{
                    System.out.println("No es un numero par ");
                 
             }
            
        }
        
        
    }
    
}
