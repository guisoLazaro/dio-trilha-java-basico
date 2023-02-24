package com.projetono;

public class NoDois {
    private int dado;
    private NoDois refNo = null;

    public NoDois() {
    }

    public NoDois(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoDois getRefNo() {
        return refNo;
    }

    public void setRefNo(NoDois refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoDois{" +
                "dado=" + dado +
                '}';
    }
}
