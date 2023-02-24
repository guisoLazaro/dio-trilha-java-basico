import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero para fatorial: ");
        n = sc.nextInt();
        int fatorial = n;
        for(int i = 1; i < n; i++){
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + n + " é " + fatorial);
    }
}
