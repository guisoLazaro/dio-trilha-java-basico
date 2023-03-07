import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioCrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Telefonou par a vítima?");
        lista.add(sc.next());
        System.out.println("Esteve no local do crime?");
        lista.add(sc.next());
        System.out.println("Mora perto da vitima?");
        lista.add(sc.next());
        System.out.println("Devia para a vitima?");
        lista.add(sc.next());
        System.out.println("Ja trabalhou com a vitima?");
        lista.add(sc.next());

        int s = 0;
        int n = 0;
        for(String list : lista){
            if(list.equals("Sim")){
                s++;
            }else{
                n++;
            }
        }
        if(s < 2){
            System.out.println("Inocente");
        }
        else if(s == 2){
            System.out.println("Suspeita");
        }else if(s <= 4){
            System.out.println("Cúmplice");
        }else{
            System.out.println("Assassina");
        }


    }
}
