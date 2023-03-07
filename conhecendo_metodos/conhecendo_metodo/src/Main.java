import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int hora = sc.nextInt();
        System.out.println(horario(hora));
    }
        public static double soma(int n1, int n2){
            return n1 + n2;
        }

        public static double divisao(double n1, double n2){
            return n1 / n2;
        }

        public static double subtracao(int n1, int n2){
            return n1 - n2;
        }

        public static double multiplicacao(int n1, int n2){
            return n1 * n2;
        }

        public static String horario(int hora){
            if(hora <= 12){
                return "Bom dia";
            }
            else if(hora <= 18){
                return"Boa Tarde";
            }
            else{
                return "Boa noite";
            }

        }

        public static double emprestimo(double valor, int parcelas){
            if(parcelas > 3){
                return valor = valor + (valor * 0.1);
            }
            else{
                return valor = valor + (valor * 0.05);
            }
        }
}