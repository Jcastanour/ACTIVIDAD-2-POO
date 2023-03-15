package ejercicio_14;
import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;

        System.out.println("Ingrese las ventas del departamento 1: ");
        Scanner vd1 = new Scanner(System.in);
        VD1 = vd1.nextInt();
        System.out.println("Ingrese las ventas del departamento 2: ");
        Scanner vd2 = new Scanner(System.in);
        VD2 = vd2.nextInt();
        System.out.println("Ingrese las ventas del departamento 3: ");
        Scanner vd3 = new Scanner(System.in);
        VD3 = vd3.nextInt();

        System.out.println("Ingrese el salario que reciben los trabajadores: ");
        Scanner salar = new Scanner(System.in);
        SALAR = salar.nextInt();
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;

        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }
        /**/
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }
        /**/
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }
        //impresión//
        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: " + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: " + SALAR3);

    }
}
