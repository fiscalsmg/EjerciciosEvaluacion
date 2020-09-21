import javax.swing.*;
import java.util.Scanner;

public class JavaB0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num,bin;

        System.out.println("ingresa una cadena de numeros");
        num=in.nextLine();
        String[] s= num.split(",");
        int [] decimal=new int[s.length];
        for (int i = 0; i< s.length; i++)    {
           // System.out.print(s[i]+",");
            decimal[i]=Integer.parseInt(s[i]);
           // System.out.println(decimal[i]);
            if(decimal[i]  < 127 && decimal[i] > -128){
                bin=Integer.toBinaryString(decimal[i] & 0xFF);
                System.out.print(bin+",");
            }
        }


        //decimal=Integer.parseInt(s);
        /*double rango;

        rango=Double.parseDouble(JOptionPane.showInputDialog("Introduce una cadena de numeros:"));
        if(rango > 127 && rango < -128){
            System.out.println("Error");
        }else {
            System.out.println("ksddsks");
        }*/

    }

}
