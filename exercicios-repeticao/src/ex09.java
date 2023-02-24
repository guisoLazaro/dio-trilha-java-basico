import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];

        for(int i = 0; i < vet.length; i++){
            vet[i] = sc.nextInt();
        }
        for(int vets : vet){
            System.out.print(vets + " ");
            System.out.print(vets+1 + " ");
        }

    }
}
