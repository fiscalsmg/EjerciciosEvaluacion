import java.util.Scanner;
//0,1,2,3,-1,-2,-3,127,126,-128,-127,150,-150
//00000000,00000001,00000010,00000011,11111111,11111110,11111101,01111111,01111110,10000000,10000001,
//0,1,2,3,127,126,150
public class JavaB0 {
    private static String bin,deci;
    private static  String[] marca;
    private static  String[] marcaDecimal;
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
                bin=Integer.toBinaryString((binario[i] & 0xFF)+ 0x100).substring(1);
                marcaDecimal=bin.split(",");
                System.out.print(bin+",");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < binario.length ; i++) {
            if((binario[i]  <255) && (binario[i] >= 0)){
                deci=Integer.toBinaryString((binario[i] & 0xFF)+ 0x100).substring(1);
                ejercicio2(deci);
            }

        }
    }

    static public void ejercicio2(String bin){
         int decimalConvertido = Integer.parseInt(bin, 2);
         System.out.print(decimalConvertido+",");
    }

}
