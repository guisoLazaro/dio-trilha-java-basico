import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = sc.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
            nota = sc.nextInt();

        }
    }
}
