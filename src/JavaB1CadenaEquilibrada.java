import java.util.Scanner;
import java.util.Stack;

public class JavaB1CadenaEquilibrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el valor de la piramide");
        String cad= in.nextLine();
        verifica(cad);


    }
    public static boolean verifica(String cadena)  {
        Stack<String> pila = new Stack<String>();
        int i = 0;
        while (i<cadena.length()) {  // Recorremos la expresión carácter a carácter
            if(cadena.charAt(i)=='(') {pila.push("(");} // Si el paréntesis es de apertura apilamos siempre
            else if  (cadena.charAt(i)==')') {  // Si el paréntesis es de cierre actuamos según el caso
                if (!pila.empty()){ pila.pop(); } // Si la pila no está vacía desapilamos
                else { pila.push(")"); break; } // La pila no puede empezar con un cierre, apilamos y salimos
            }
            i++;
        }
        if(pila.empty()){
            return true;
        } else {
            return false;
        }

    }
}
