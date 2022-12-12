/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio10Carmen {
    public static void main(String[] args) {
        int[] vector = new int[20];
        int[] posicion= new int[20];//vector utilizo para guardar posiciones d numeros repetidos
        
        for (int i = 0; i < vector.length; i++) {//Bucle crear numeros aleatorios
            vector[i]= (int) (Math.random()*25+0);
            
        }
        System.out.println("*************************");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }
        
        System.out.println("*************************");
        int contador=0, pos=0;
        
        boolean noEstaRepetido=false;//variable boolean para que no salgan el mismo numero mostrado varias veces
        for (int i = 0; i < vector.length; i++) {
            contador=0;//reinicio el contador en cada pasada del bucle j
            pos=0;
            noEstaRepetido=false;
            for (int j = 0; j <vector.length; j++) {
                
                if (vector[i]== vector[j]) {
                    contador++;
                    posicion[pos]= j;
                    pos++;
                    
                }
                
            }
            if (contador>1) {
                for (int h = 0; h < i; h++) {//Bucle que comprueba si ese numero se ha repetido anteriormente y pone noEstaRepetido en TRUE
                    if (vector[i] == vector[h]) {
                        noEstaRepetido =true;
                        
                    }
                    
                }
                
            
            if ( noEstaRepetido == false) {//Si el numer repetido no ha sido mostrado por pantalla lo muestro
                System.out.println("El numero:" + vector[i]+ " esta repetido: "+contador+" veces");
                System.out.print("Posicion: ");
                for (int k = 0; k < contador; k++) {
                        System.out.println(posicion[k]);
                    
                }
                System.out.println("\n********************");
            }
        }
        }
        
        
        
        
        
        
        
        
    }
    
}
