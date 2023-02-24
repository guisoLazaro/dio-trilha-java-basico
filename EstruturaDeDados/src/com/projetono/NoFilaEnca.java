package com.projetono;

public class NoFilaEnca<T> {

    private T conteudo;
    private NoFilaEnca proximoNo;

    public NoFilaEnca() {
        this.proximoNo = null;
    }

    public NoFilaEnca(T conteudo) {

        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public NoFilaEnca(T conteudo, NoFilaEnca proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoFilaEnca getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoFilaEnca proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoFilaEnca{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncaeado(){
        String str = "NoFilaEnca{" +
                "conteudo=" + conteudo +
                '}';

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->Null";
        }
        return str;
    }
}
