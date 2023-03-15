package ejercicio_23;

import java.util.Scanner;

public class Ejercicio_23 {

    public static void main(String[] args) {
        double A, B, C, S1, S2, discri;

        System.out.println("ingrese el valor del coeficiente A: ");
        Scanner a = new Scanner(System.in);
        A = a.nextDouble();

        System.out.println("ingrese el valor del coeficiente B: ");
        Scanner b = new Scanner(System.in);
        B = b.nextDouble();

        System.out.println("ingrese el valor del coeficiente C: ");
        Scanner c = new Scanner(System.in);
        C = c.nextDouble();

        //Discrimnante (si es <0 no tienee soluciones en los reales
        discri = Math.pow(B, 2) - (4 * A * C);

        if (discri < 0) {
            System.out.println("No hay solucion en los reales ");
        } else {
            S1 = (-(B) + Math.sqrt(discri)) / (2 * A);
            S2 = (-(B) - Math.sqrt(discri)) / (2 * A);
            System.out.println("Las posibles soluciones de dicha ecuación son: " + S1 + " Y " + S2);
        }

    }
}
