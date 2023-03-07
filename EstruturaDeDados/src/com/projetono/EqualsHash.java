package com.projetono;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EqualsHash {
    public static void main(String[] args) {
       /* List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagem"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        */

        //stack:

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("ford"));
        stackCarros.push(new Carro("ferrari"));
        stackCarros.push(new Carro("fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros.empty());

    }
}
