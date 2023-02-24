package com.projetono;

public class Pilha {

    private NoDois refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(NoDois novoNo){
        NoDois refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public NoDois pop(){
        if(!this.isEmpty()){
            NoDois noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return  null;
    }
    public NoDois top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){

        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
       String stringRetorno = "------------------\n";
       stringRetorno += "   Pilha\n";
       stringRetorno += "------------------\n";

       NoDois noAuxiliar =refNoEntradaPilha;
       while(true){
           if(noAuxiliar != null){
               stringRetorno += "[NoDois{dado=" + noAuxiliar.getDado() +"}]\n";
               noAuxiliar = noAuxiliar.getRefNo();
           }else{
               break;
           }
       }
        stringRetorno += "==================\n";
        return stringRetorno;
    }
}
