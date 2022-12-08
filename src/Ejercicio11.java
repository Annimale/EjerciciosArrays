/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        
        
        int[]vectorP={1,20,30,40,8,19,28,94,99,25};
        
        for (int i = 0; i < vectorP.length; i++) {
            
            System.out.println("Numeros del vectorP: "+vectorP[i]);
            
        }
        int[]vectorV= new int [vectorP.length];
        for (int i = 0; i < vectorV.length; i++) {//BUCLE PARA ASIGNAR LOS VALORES DEL PRIMER ARRAY AL SEGUNDO ARRAY
                vectorV[i]=vectorP[i];//Aqui decimos que los valores del vectorV se asignen al vectorP
            
        }
        
        
        for (int i = 0; i < vectorV.length; i++) {
            if (vectorV[i]>10) {
                System.out.println("Numeros del primer array que son mayores que diez visualizandolos en el segundo array: "+vectorV[i]);
                
            }
            
        }
            
        }
        
        
    }
    

