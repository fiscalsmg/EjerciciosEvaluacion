import java.util.Scanner;

public class JavaB1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el valor de la piramide");
        int n= in.nextInt();


        triangulo(n);
    }

    static public void triangulo(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print(" ");//decremento para los espacios
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" *"); //dibuja los *
            }
            System.out.println("");//da los saltos respecto a n
        }
    }
}
