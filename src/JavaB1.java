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
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    static public void cuadrado(int n){
        //valida
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    static public void contorno(int n){
        //arriba
        for (int j = 0; j <n ; j++) {
            System.out.print(" *");
        }
        System.out.println("");

        //medio
        for (int i = 0; i <n-2 ; i++) {
            System.out.print(" * ");
            for (int j = 0; j <n-2 ; j++) {
                System.out.print(" ");
            }
            System.out.println("   * ");
        }
        //final
        for (int j = 0; j <n ; j++) {
            System.out.print(" *");
        }
        System.out.println(" ");
    }
}
