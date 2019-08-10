package com.example.fatorial;

public class Fat {
    private int n;
    private int r = 1;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Fat (int n){ this.n = n; }

    public int Fatoria(int n){
        if (n == 1 || n == 0) return 1;
        for (int i=1;i<=n;i++){
            r = i * r;
        }
        return r;
    }



}
