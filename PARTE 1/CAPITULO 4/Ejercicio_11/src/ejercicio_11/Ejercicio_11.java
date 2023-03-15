
package ejercicio_11;

import java.util.Scanner;

public class Ejercicio_11 {

public static void main(String[] args) {
        int i,NumMayor;
        Scanner valor = new Scanner(System.in);        
        int vector[] = new int[3];
       
       
        for(i=0; i<3; i= i+1) {            
            System.out.println("Ingrese valor "+(i+1)+": ");            
            vector[i] = valor.nextInt();                                                  
        }              
       
       
        NumMayor = vector[0];
        for (i=1; i<3; i=i+1) {
            if (vector[i]>NumMayor) {
                NumMayor = vector[i];                
            }                                          
        }
        System.out.println("El numero mayor es: "+NumMayor);
       
       
    }
}
  