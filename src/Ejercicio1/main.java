package Ejercicio1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int numero = 127; //Declaramos el número decimal que deseamos pasar a binario.
        String binario = ""; //Variable aux para guardar la cadena de binarios.
        while (numero > 0) {
            //Utilización de if simplificado en el cual se verifica si el residuo de la división es 0 en caso de cumplirse se agrega 0 a la var aux.
            //binario = numero % 2 == 0 ? "0" + binario : "1" + binario;
            if(numero%2==0){
                binario="0"+binario;
            }else {
                binario="1"+binario;
            }
            numero = numero / 2; //Esta condición es la permite salir del bucle.
        }
        System.err.print(binario+"\n"); //Imprimes el resultado almacenado en la variable "binario"
    }

}