package figuras_geometricas;

public class Cuadrado {

    int ladoC;

    Cuadrado(int ladoC) {
        this.ladoC = ladoC;
    }

    double CalcuarArea() {
        return ladoC * ladoC;
    }

    double CalcularPerimetro() {
        return ladoC * 4;
    }

}
