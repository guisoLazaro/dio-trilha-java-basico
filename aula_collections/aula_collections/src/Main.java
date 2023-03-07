import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(5.5);
        notas.add(6.5);
        notas.add(7.5);
        notas.add(7.5);
        notas.add(7.5);
        notas.add(8.5);
        notas.add(8.5);
        System.out.println(notas);
        System.out.println(notas.indexOf(5.5)); //posição do elemento 5.5
        notas.add(4, 8.0); //adiciona um elemento na posição 4
        System.out.println(notas);
        notas.set(notas.indexOf(8.0), 10.0); //subistitui o elemento 8 pelo 10.0
        System.out.println(notas);
        System.out.println(notas.contains(10.0)); //verifica se tem ou não o elemento 10.0
        for (Double nota: notas) {
            System.out.println(nota);
        }
        System.out.println(notas.get(2)); //retorna o elemento na posição 2
        System.out.println(Collections.min(notas)); //mostra a menor nota/elemento da lista
        System.out.println(Collections.max(notas)); //exibe a maior nota
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        double soma1 = 0.0;
        for (Double nota: notas) {
            soma1 += nota;
        }
        System.out.println(soma1);
        notas.size(); //tamanho da lista
        notas.remove(10.0); //remove pela posição ou o elemento
        notas.isEmpty(); //verifica se tem ou não elementos na lista

        List<Double> lista2 = new LinkedList<>(notas);
        System.out.println(lista2);
        System.out.println(lista2.get(0));
        System.out.println(lista2.remove(0));

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Jon", 18, "Preto"));
        gatos.add(new Gato("Verme", 13, "Branco"));
        gatos.add(new Gato("Tom", 1, "Cinza"));
        System.out.println(gatos);
        Collections.shuffle(gatos);
        System.out.println(gatos);
        Collections.sort(gatos);
        System.out.println(gatos);
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);
        Collections.sort(gatos, new ComparatorCorNomeIdade());
        System.out.println(gatos);
    }


}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorCorNomeIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;
        return Integer.compare(g1.getIdade(), g1.getIdade());

    }
}