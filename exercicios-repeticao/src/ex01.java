import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nome:");
            String nome = sc.next();
            if(nome.equals("0")){ //equals utilizado pra comparar strings
                break;
            }
            System.out.println("Idade: ");
            int idade = sc.nextInt();
        }
    }
}
