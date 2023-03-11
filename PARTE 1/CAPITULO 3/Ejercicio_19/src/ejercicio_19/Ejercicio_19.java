package ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double lado, perimetro, altura, area;

        System.out.println("Ingrese el valor de el lado de el triangulo:");
        lado = valor.nextDouble();
        perimetro = 3 * lado;
        altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado / 2, 2));
        area = (lado * altura) / 2;

        System.out.println("El perimetro es " + perimetro);
        System.out.println("La altura es " + altura);
        System.out.println("El area es " + area);

    }
}
