import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int numeros;
        int par = 0;
        int impar = 0;
        int x = 0;
        System.out.println("Quantos numeros serão digitados: ");
        n = sc.nextInt();
        do {
            numeros = sc.nextInt();
            if (numeros % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            x++;
        }while(x < n);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}
