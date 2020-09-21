package Ejercicio1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int numero = -10; //Declaramos el número decimal que deseamos pasar a binario.
        String binario = ""; //Variable aux para guardar la cadena de binarios.
        if(numero>0){
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                numero = numero / 2;
            }
            System.err.print(binario+"\n");
        }else {
            System.out.println("Negativo");

            String bin=Integer.toBinaryString(numero & 0xFF);
            System.out.println(bin);
        }
    }
}
