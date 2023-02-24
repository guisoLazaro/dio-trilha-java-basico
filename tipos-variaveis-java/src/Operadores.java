public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        boolean variavel = true;
        System.out.println(!variavel); // nega a variavel
        System.out.println(variavel);

        //operador ternário:
        int a, b;
        a = 5;
        b = 6;
        //String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(a == b?"Verdadeiro" : "Falso");
    }
}
