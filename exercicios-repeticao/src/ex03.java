import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int x = 0;
        int maior = 0;
        int soma = 0;
        double media = 0.0;
        do{
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if(x == 0){
                maior = numero;
            }
            else if(numero > maior){
                maior = numero;
            }
            soma += numero;
            x++;
        }while (x < 5);
        media = (double)soma / x;
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
    }
}
