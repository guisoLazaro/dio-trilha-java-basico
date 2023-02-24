import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int x = 0;

        do{
            System.out.print("Caractere: ");
            String letra = sc.next();
            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o" )||
                    letra.equalsIgnoreCase("u"))){
                consoantes[x] = letra;
                quantidadeConsoantes++;
            }
            x++;
        }while(x < 6);
        for (String consoante : consoantes){
            System.out.println(consoante);
        }
    }
}
