package ejercicio_15;
import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        int PESOA,PESOB,PESOC,PESOD;
       
        System.out.println("¿Cual es el peso de la esfera A?");
        Scanner pesoa = new Scanner(System.in);
        PESOA= pesoa.nextInt();/**/
        System.out.println("¿Cual es el peso de la esfera B?");
        Scanner pesob = new Scanner(System.in);
        PESOB= pesob.nextInt();/**/
        System.out.println("¿Cual es el peso de la esfera C?");
        Scanner pesoc = new Scanner(System.in);
        PESOC= pesoc.nextInt();/**/
        System.out.println("¿Cual es el peso de la esfera D?");
        Scanner pesod = new Scanner(System.in);
        PESOD= pesod.nextInt();
         
        if((PESOA==PESOB)&&(PESOA==PESOC)){
            System.out.println("LA ESFERA D ES LA DIFERENTE Y ");
            if (PESOD>PESOA){
                System.out.print("ES DE MAYOR PESO");
            }
            else{
                System.out.print("ES DE MENOR PESO");
               
            }
        }
        else if((PESOA==PESOB)&&(PESOA==PESOD)){
            System.out.println("LA ESFERA C ES LA DIFERENTE Y ");
            if (PESOC>PESOA){
                System.out.print("ES DE MAYOR PESO");
            }
            else{
                System.out.print("ES DE MENOR PESO");
               
            }
        }
        else if((PESOA==PESOC)&&(PESOA==PESOD)){
            System.out.println("LA ESFERA B ES LA DIFERENTE Y ");
            if (PESOB>PESOA){
                System.out.print("ES DE MAYOR PESO");
            }
            else{
                System.out.print("ES DE MENOR PESO");
            }
        }
        else{
            System.out.println("LA ESFERA A ES LA DIFERENTE Y ");
            if (PESOA>PESOB){
                System.out.print("ES DE MAYOR PESO");
            }
            else{
                System.out.print("ES DE MENOR PESO");
               
            }
        }  
    }
}
