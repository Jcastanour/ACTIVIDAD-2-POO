
package ejercicio_22;
import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor, horas, salarioMensual;
        String nombre;
       
        System.out.println("Por favor ingrese el nombre:");
        nombre = input.nextLine();
       
        System.out.println("Por favor ingrese el salario(por hora) de "+ nombre);
        valor = input.nextDouble();
       
         System.out.println("Por favor ingrese el número de horas trabajadas");
        horas = input.nextDouble();
       
       
        salarioMensual = valor*horas;
       
        if (salarioMensual>450000) {
            System.out.println("Nombre: "+nombre+". Salario: "+salarioMensual);              
        }
        else {
            System.out.println("Nombre: "+nombre);
        }                                      
    }
}
