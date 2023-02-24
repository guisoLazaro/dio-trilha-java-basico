import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV(true, 37,50);
        System.out.println("Estado da TV:");
        System.out.println("Tv ligda: " + tv.ligada);
        System.out.println("Canal: ");
        System.out.println(tv.canal);
        System.out.println("Volume: ");
        System.out.println(tv.volume);

        tv.desligarTV();
        System.out.println("Tv ligada: " + tv.ligada);

        tv.escolherCanall(40);
        System.out.println("Novo canal: " + tv.canal);
        tv.aumentarVolume();
        System.out.println(tv.volume);
        tv.aumentarVolume();
        System.out.println(tv.volume);
        tv.aumentarCanal();
        System.out.println(tv.canal);


    }
}
