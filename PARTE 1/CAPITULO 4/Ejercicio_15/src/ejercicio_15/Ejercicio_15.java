package ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        int PESOA, PESOB, PESOC, PESOD;

        System.out.println("¿Cual es el peso de la esfera A?");
        Scanner pesoa = new Scanner(System.in);
        PESOA = pesoa.nextInt();/**/
        System.out.println("¿Cual es el peso de la esfera B?");
        Scanner pesob = new Scanner(System.in);
        PESOB = pesob.nextInt();/**/
        System.out.println("¿Cual es el peso de la esfera C?");
        Scanner pesoc = new Scanner(System.in);
        PESOC = pesoc.nextInt();/**/
        System.out.println("¿Cual es el peso de la esfera D?");
        Scanner pesod = new Scanner(System.in);
        PESOD = pesod.nextInt();

        if ((PESOA == PESOB) && (PESOA == PESOC)) {
            if (PESOD > PESOA) {
                System.out.print("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.print("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");

            }
        } else if ((PESOA == PESOB) && (PESOA == PESOD)) {
            if (PESOC > PESOA) {
                System.out.print("LA ESFERA C ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.print("LA ESFERA C ES LA DIFERENTE Y ES DE MENOR PESO");

            }
        } else if ((PESOA == PESOC) && (PESOA == PESOD)) {
            if (PESOB > PESOA) {
                System.out.print("LA ESFERA B ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.print("LA ESFERA B ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        } else {
            if (PESOA > PESOB) {
                System.out.print("LA ESFERA A ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.print("LA ESFERA A ES LA DIFERENTE Y ES DE MENOR PESO");

            }
        }
    }
}
