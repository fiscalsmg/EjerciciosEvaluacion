import java.util.Scanner;

public class JavaB0 {
    private static String bin,deci;
    private static  String[] marca;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;

        System.out.println("ingresa una cadena de numeros");
        num=in.nextLine();
        marca= num.split(",");
        ejercicio1();

    }

    static public void ejercicio1(){
        int [] binario=new int[marca.length];
        for (int i = 0; i< marca.length; i++)    {
            binario[i]=Integer.parseInt(marca[i]);
            if((binario[i]  <= 127) && (binario[i] >= (-128))){
                bin=Integer.toBinaryString(binario[i] & 0xFF);
                System.out.print(bin+",");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < binario.length ; i++) {
            //System.out.println(binario[i]);
                deci=Integer.toBinaryString(binario[i] & 0xFF);
                ejercicio2(deci);
        }
    }

    static public void ejercicio2(String bin){
         int decimalConvertido = Integer.parseInt(bin, 2);
         System.out.print(decimalConvertido+",");
    }

}
