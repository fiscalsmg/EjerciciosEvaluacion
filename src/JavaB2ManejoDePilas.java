import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class JavaB2ManejoDePilas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack pila = new Stack();

        int respose=0;

        do{
            System.out.println("Menu de opciones\n1.Inserta el valor de x en la pila" +
                    "\n2.Elimina un elemento de la pila" +
                    "\n3.Imprime el numero de elementos actuales en la pila" +
                    "\n4.Imprime toda la pila y cierra el programa\n");
            respose = Integer.valueOf(in.nextLine());
            switch (respose){
                case 1:
                    System.out.println();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while (respose!=0);




    }
}
