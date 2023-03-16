package figuras_geometricas;

import java.util.Scanner;

public class Figuras_geometricas {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int radio, BaseRect, AlturaRect, ladoC, baset, alturat;

        // Circulo //
        System.out.println("Ingrese el valor del radio del circulo: ");
        radio = valor.nextInt();

        Circulo figura1 = new Circulo(radio);
        System.out.println("El area del circulo es: " + figura1.calcularArea()); // Area
        System.out.println("El perimetro del circulo es: " + figura1.calcularperimetro()); //Perimetro

        // Rectangulo//
        System.out.println("Ingrese el valor de la base del rectangulo: ");
        BaseRect = valor.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        AlturaRect = valor.nextInt();

        Rectangulo figura2 = new Rectangulo(BaseRect, AlturaRect);
        System.out.println("El area del rectangulo es: " + figura2.area());
        System.out.println("El perimetro del rectangulo es: " + figura2.perimetro());

        // Cuadrado //
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        ladoC = valor.nextInt();

        Cuadrado figura3 = new Cuadrado(ladoC);
        System.out.println("El area del cuadrado es: " + figura3.CalcuarArea());
        System.out.println("El preimtetro del cuadrado es: " + figura3.CalcularPerimetro()); 

        // Triangulo //
        System.out.println("ingrese el valor de la base del triangulo rectangulo: ");
        baset = valor.nextInt();
        System.out.println("ingrese el valor de la altura del triangulo rectangulo: ");
        alturat = valor.nextInt();

        Triangulo figura4 = new Triangulo(baset, alturat);
        System.out.println("El area del triangulo es: " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es: " + figura4.calcularPerimetro());

        // Tipo de triangulo //
        figura4.determinarTipoTriangulo();

    }

}
