package ejercicio_18;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        String empID, nombre;
        double horas, valorHora, impuesto, resta, salarioBruto, salarioNeto;

        Scanner imput = new Scanner(System.in);

        System.out.println("Cual es el nombre del trabajador?: ");
        nombre = imput.next();

        System.out.println("Cual es la ID del trabajador?:");
        empID = imput.next();

        System.out.println("Cuantas horas trabajo?:");
        horas = imput.nextDouble();

        System.out.println("Cuanto cobra por hora?:");
        valorHora = imput.nextDouble();

        System.out.println("Cual es el valor de la retencion en la fuente?(en porcentaje):");
        impuesto = imput.nextDouble();

        salarioBruto = horas * valorHora;

        resta = salarioBruto * (impuesto / 100);
        salarioNeto = salarioBruto - resta;

        System.out.println("ID: " + empID + ". " + nombre + ". Salario bruto: " + salarioBruto + ". Salario neto: " + salarioNeto);
    }
}
