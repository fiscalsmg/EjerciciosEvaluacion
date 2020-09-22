import java.util.Scanner;

public class JavaB0 {
    private static String num;
    private static String bin;
    private static  String[] s;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("ingresa una cadena de numeros");
        num=in.nextLine();
        s= num.split(",");
        exercisesOne();

    }

    static public void exercisesOne(){
        int [] decimal=new int[s.length];
        for (int i = 0; i< s.length; i++)    {
            decimal[i]=Integer.parseInt(s[i]);
            if((decimal[i]  <= 127) && (decimal[i] >= (-128))){
                bin=Integer.toBinaryString(decimal[i] & 0xFF);
                System.out.print(bin+",");
            }
        }
    }

}
