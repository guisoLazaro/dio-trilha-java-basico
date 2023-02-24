package com.projetono;

public class ImplementarPilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new NoDois(1));
        minhaPilha.push(new NoDois(2));
        minhaPilha.push(new NoDois(3));
        minhaPilha.push(new NoDois(4));
        minhaPilha.push(new NoDois(5));
        minhaPilha.push(new NoDois(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);

    }
}
