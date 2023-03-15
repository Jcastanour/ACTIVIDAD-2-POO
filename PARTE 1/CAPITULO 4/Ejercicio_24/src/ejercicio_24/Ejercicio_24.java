package ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args) {
        double A, B, C;

        System.out.println("ingrese el peso de la esfera A: ");
        Scanner a = new Scanner(System.in);
        A = a.nextDouble();

        System.out.println("ingrese el peso de la esfera B: ");
        Scanner b = new Scanner(System.in);
        B = b.nextDouble();

        System.out.println("ingrese el peso de la esfera C: ");
        Scanner c = new Scanner(System.in);
        C = c.nextDouble();

        if ((A > B) && (A > C)) {
            System.out.println("La esfera de mayor peso es la A CON UN PESO DE: " + A );
        } else if ((B > A) && (B > C)) {
            System.out.println("La esfera de mayor peso es la B CON UN PESO DE: " + B );
        } else {
            System.out.println("La esfera de mayor peso es la C CON UN PESO DE: " + C );
        }
    }
}
