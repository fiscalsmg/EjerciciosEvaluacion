import java.util.Scanner;
import java.util.Stack;

public class JavaB1CadenaEquilibrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa una Cadena");
        String cad= in.nextLine();

        Stack pila = new Stack();
        char[] c;
        for (int i = 0; i < cad.length(); i++) {
            c=cad.toCharArray();

            if(c[i]=='('){
                pila.push(c[i]);
            }
            if(c[i]== ')'){
                //pila.push("()");
                pila.pop();
            }
        }
        System.out.println(pila);
    }

}
