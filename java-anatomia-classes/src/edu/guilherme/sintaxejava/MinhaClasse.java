package edu.guilherme.sintaxejava;

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Ola");
        String meuNome = "Guilherme";

        int anoFabricacao = 2022;
        boolean verdadeira = true;
        boolean falsa = false;
        String primeiroNome = "Guilherme";
        String segundoNome = "Lazaro";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        anoFabricacao = 2018;
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
