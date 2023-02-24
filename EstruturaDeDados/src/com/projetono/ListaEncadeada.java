package com.projetono;

public class ListaEncadeada<T> {

    NoFilaEnca<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }


    public void add(T conteudo){
        NoFilaEnca<T> novoNo = new NoFilaEnca<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        NoFilaEnca<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }
    private NoFilaEnca<T> getNo(int index){
        validaIndice(index);
        NoFilaEnca<T> noAuxiliar = referenciaEntrada;
        NoFilaEnca<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        NoFilaEnca<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();

        }
        NoFilaEnca<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();

    }
    public int size(){
        int tamanhoLista = 0;
        NoFilaEnca<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo()!=null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + "desta lista. Esta lista só vai até o indice " + ultimoIndice + ".");
        }
    }
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoFilaEnca<T> noAuxilitar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "No{conteudo=" + noAuxilitar.getConteudo() + "}]--->";
            noAuxilitar = noAuxilitar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
