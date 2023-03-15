
package ejercicio_13;
import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        int VALCOMP, VALPAG, PDES;
        String COLOR;
        PDES=0;
        
        System.out.println("¿Cual es el valor de la compra?");
        Scanner valcom= new Scanner(System.in);
        VALCOMP= valcom.nextInt();
        
        System.out.println("¿Cual es el color de la bolita?");
        Scanner colo= new Scanner(System.in);
        COLOR= colo.next();
        
        if(COLOR.equals("BLANCO")){
            PDES=0;
        }
        else if(COLOR.equals("VERDE")){
            PDES=10;
        }
        else if(COLOR.equals("AMARILLO")){
            PDES=25;
        }
        else if(COLOR.equals("AZUL")){
            PDES=50;
        }
        else{
            PDES=50;
        }
        
        VALPAG= VALCOMP-((PDES*VALCOMP)/100);
        System.out.println("EL CLIENTE DEBE PAGAR:$"+VALPAG);

    }
}
