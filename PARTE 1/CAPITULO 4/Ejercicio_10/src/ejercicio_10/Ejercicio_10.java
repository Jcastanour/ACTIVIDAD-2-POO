package ejercicio_10;
import java.util.Scanner;
public class Ejercicio_10 {

    public static void main(String[] args) {
        int estrato;
        double patrimonio, pagmat;
        String ni, nombre;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el numero de inscripion: ");
        ni = entrada.nextLine();
        System.out.print("Digita tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el patrinomio: ");
        patrimonio = entrada.nextDouble();
        System.out.print("Digite el estrato social: ");
        estrato = entrada.nextInt();

        pagmat = 50000;
        if ((patrimonio > 2000000) && (estrato > 3)) {
            pagmat = pagmat + 0.03 * patrimonio;
        }

        System.out.println("El estudiante " + nombre + " con numero de identificacion " + ni + " debe pagar $" + pagmat);

    }

}
