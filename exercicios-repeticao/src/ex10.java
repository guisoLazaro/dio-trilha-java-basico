import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        for (int[] ints : M) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }


    }
}
