import java.util.Scanner;

public class JavaB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el valor de la piramide");
        int n= in.nextInt();
        //valida
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
