import javax.swing.*;
import java.util.Scanner;

public class JavaB0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rango;

        rango=Double.parseDouble(JOptionPane.showInputDialog("Introduce una cadena de numeros:"));
        if(rango > 127 && rango < -128){
            System.out.println("Error");
        }else {
            System.out.println("ksddsks");
        }

    }

}
