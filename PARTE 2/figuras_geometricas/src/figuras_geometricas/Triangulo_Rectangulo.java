package figuras_geometricas;

public class Triangulo_Rectangulo {

    int baset, alturat;

    public Triangulo_Rectangulo(int baset, int alturat) {
        this.baset = baset;
        this.alturat = alturat;
    }

    double calcularHipotenusa() {
        return Math.pow(baset * baset + alturat * alturat, 0.5);
    }

    double calcularArea() {
        return (baset * alturat / 2);
    }

    double calcularPerimetro() {
        return (baset + alturat + calcularHipotenusa());
    }

    void determinarTipoTriangulo() {
        if ((baset == alturat) && (baset == calcularHipotenusa()) && (alturat == calcularHipotenusa())) {
            System.out.println("Es un triangulo equilatero");
        } else if ((baset != alturat) && (baset != calcularHipotenusa()) && (alturat != calcularHipotenusa())) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");

        }
    }
}
