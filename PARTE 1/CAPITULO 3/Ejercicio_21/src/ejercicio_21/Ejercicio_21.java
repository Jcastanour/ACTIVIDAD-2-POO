package ejercicio_21;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double lado1, lado2, lado3, perimetro, semiperimetro, area, s;

        System.out.println("Ingrese el valor de el lado 1:");
        lado1 = valor.nextDouble();

        System.out.println("Ingrese el valor de el lado 2:");
        lado2 = valor.nextDouble();

        System.out.println("Ingrese el valor de el lado 3:");
        lado3 = valor.nextDouble();

        perimetro = lado1 + lado2 + lado3;
        semiperimetro = (lado1 + lado2 + lado3) / 2;
        s = semiperimetro;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El semiperimetro es: " + semiperimetro);
        System.out.println("El area es: " + area);
    }
}
