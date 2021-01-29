import java.util.Scanner;
//0,1,2,3,-1,-2,-3,127,126,-128,-127,150,-150,512
//00000000,00000001,00000010,00000011,11111111,11111110,11111101,01111111,01111110,10000000,10000001,
//0,1,2,3,127,126,150

//0,1,2,3,-1,-2,-3,127,126,-128,-127,150,-150,512,-100,-22,0
//00000000,00000001,00000010,00000011,11111111,11111110,11111101,01111111,01111110,10000000,10000001,10011100,11101010,00000000,
//0,1,2,3,255,254,253,127,126,128,129,156,234,0,


/*PDF
0,-128,127
00000000,10000000,01111111,
0,128,127,
* */
public class JavaB0 {
    private static String bin;
    private static  String[] marca;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;

        System.out.println("ingresa una cadena de numeros");
        num=in.nextLine();
        marca= num.split(",");
        ejercicio1();

    }

    static public void ejercicio1() {
        int[] binario = new int[marca.length];
        int num = 0;
        int[] guarda = new int[marca.length];
        String cad = "";
        for (int i = 0; i < marca.length; i++) {
            binario[i] = Integer.parseInt(marca[i]);
            if ((binario[i] <= 127) && (binario[i] >= (-128))) {
                bin = Integer.toBinaryString((binario[i] & 0xFF) + 0x100).substring(1);
                // marcaDecimal=bin.split(",");
                System.out.print(bin + ",");//imprime numeros binarios
                //se convierte de binario a decimal bin es la cadena de binarios, se castea el string
                num = Integer.parseInt(bin, 2);//variable num guarda los numeros decimales
                guarda[i] = num;//se guardan los numeros en el arreglo
                cad = cad + guarda[i] + ",";//concatena los valores de los valores decimales
            }
        }
        System.out.println("\n" + cad);
    }
}
