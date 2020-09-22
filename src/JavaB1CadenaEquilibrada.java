import java.util.Scanner;
import java.util.Stack;

public class JavaB1CadenaEquilibrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa una Cadena");
        String cad= in.nextLine();

        Stack pila = new Stack();
        //char[] c ;
        char c;
        String complemento="()";
        String cadenaCompleta = null;
        for (int i = 0; i < cad.length(); i++) {
            //c=cad.toCharArray();
            c=cad.charAt(i);
            if(c=='('){
                cadenaCompleta=cad.replace("(","");
            }

            System.out.println(c);
        }

        System.out.println(cadenaCompleta);
    }

}

            /*if(c==')'){
                cadenaCompleta=cad.replace(")","");
            }*/