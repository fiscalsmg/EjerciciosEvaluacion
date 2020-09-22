import java.util.Scanner;

public class JavaB0 {
    private static String bin;
    private static  String[] marks;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;

        System.out.println("ingresa una cadena de numeros");
        num=in.nextLine();
        marks= num.split(",");
        exerciseOne();

    }

    static public void exerciseOne(){
        int [] binario=new int[marks.length];
        for (int i = 0; i< marks.length; i++)    {
            binario[i]=Integer.parseInt(marks[i]);
            if((binario[i]  <= 127) && (binario[i] >= (-128))){
                bin=Integer.toBinaryString(binario[i] & 0xFF);
                System.out.print(bin+",");
            }
        }
        for (int i = 0; i < binario.length ; i++) {
            exercisesTwo(bin);
        }

    }

    static public void exercisesTwo(String bin){

         //int decimalConvertido = Integer.parseInt(bin, 2);
         //System.out.println(" "+decimalConvertido);

    }

}
