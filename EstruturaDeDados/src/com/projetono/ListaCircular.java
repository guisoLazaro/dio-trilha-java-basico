package com.projetono;

public class ListaCircular<T> {

    private NoCircular<T> cabeca;
    private NoCircular<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        NoCircular<T> novoNo = new NoCircular<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        NoCircular<T> noAuxiliar = cauda;
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoCircular<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        if(index == 0){
            return this.cauda;
        }
        NoCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" +noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() !=0 ? "(Retorna ao inicio)" : "[]";
        return strRetorno;
    }
}
