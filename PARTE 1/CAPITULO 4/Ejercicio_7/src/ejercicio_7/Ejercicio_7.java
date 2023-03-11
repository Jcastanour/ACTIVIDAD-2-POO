package ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        double A, B;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el valor A: ");
        A = entrada.nextDouble();

        System.out.println("Digite el valor B: ");
        B = entrada.nextDouble();

        if (A > B) {
            System.out.println("El valor " + A + " ES MAYOR QUE " + B);
        } 
        else {
            System.out.println("El valor " + B + " ES MAYOR QUE " + A);
        }

    }

}
