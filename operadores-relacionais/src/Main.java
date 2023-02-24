public class Main {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";

        long l1 = 1597L;
        long l2 = 89997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= i2));
        System.out.println("i1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        //nao da pra comparar tamanho de grandeza em strings, ex:
        //string1 > string2 -> maior, maior ou igual, menor, menor ou igual

        //n]ao da pra trabalhar com operadores de similaridades com char e string, ex:
        //char1 != string1
        //string2 != i1;


    }



}