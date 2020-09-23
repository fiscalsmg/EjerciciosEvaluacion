import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaB2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("cuantos numeros desea ingresar");
        int numero= in.nextInt();

        int[] guardaNumeros = new int[numero];
        String listaDeNumeros="";

        for (int i = 0; i < numero; i++) {
            System.out.println("Numero "+(i+1)+ " Ingresado");
            guardaNumeros[i]=in.nextInt();
            listaDeNumeros=listaDeNumeros+guardaNumeros[i]+",";
        }
        System.out.println(listaDeNumeros);

        //rotaciones
        int numRotaciones = 0;
        while (numRotaciones<1) {
            System.out.print("Cantidad de rotaciones: ");
            numRotaciones = in.nextInt();
            if(numRotaciones<1){
                System.out.println("Cantidad no válida. Debe ser mayor de 0.\n");
            }
        }

        for (int x = 0; x < numRotaciones ; x++) {
            int aux = guardaNumeros[0];
            for (int i = 0; i < guardaNumeros.length-1; i++) {
                guardaNumeros[i] = guardaNumeros[i+1];
            }
            guardaNumeros[guardaNumeros.length-2] = aux;

            for (int i = 0; i < guardaNumeros.length; i++) {
                System.out.print(guardaNumeros[i]+",");
            }
            System.out.println("");
        }

    }
}
