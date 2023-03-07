import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Temperatura> temperaturas =  new ArrayList<>();

        for(int i = 0; i < 6; i++){
            System.out.println("Digite o mês:");
            String mes = sc.next();
            System.out.println("Digite a temperatura");
            int temp = sc.nextInt();
            temperaturas.add(new Temperatura(mes, temp));
        }
        double soma = 0.0;
        for(Temperatura temps : temperaturas){
            soma += temps.temperatura;
        }
        double media = soma / 6.0;
        System.out.println(media);
        for(Temperatura temps : temperaturas){
            if(temps.temperatura > media){
                System.out.print(temps.mes + " " + temps.temperatura + ",");
            }
        }

    }
}

class Temperatura{
    public String mes;
    public int temperatura;

    public Temperatura(String mes, int temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
