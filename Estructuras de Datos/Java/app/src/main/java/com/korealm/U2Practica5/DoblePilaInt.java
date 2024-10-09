package com.korealm.U2Practica5;

public class DoblePilaInt {
    private int[] p;
    private int tope1;
    private int tope2;
    
    public DoblePilaInt(int n){
        p = new int[n];
        tope1 = -1;
        tope2 = n;
    }
    
    public void pushPila1(int n){
        if(!isFullPila1()){
            tope1++;
            p[tope1] = n;
        }
    }
    
    public void pushPila2(int n){
        if(!isFullPila2()){
            tope2--;
            p[tope2] = n;
        }
    }
    
    public int popPila1(){
        int n = 0;
        if(!isEmptyPila1()){
            n = p[tope1];
            p[tope1] = 0;
            tope1--;
        }
        return n;
    }
    
    public int popPila2(){
        int n = 0;
        if(!isEmptyPila2()){
            n = p[tope2];
            p[tope2] = 0;
            tope2++;
        }
        return n;
    }
    
    public boolean isEmptyPila1(){
        return(tope1 == -1);
    }
    
    public boolean isEmptyPila2(){
        return(tope2 == p.length);
    }
    
    public boolean isFullPila1(){
        return(tope1 == (p.length / 2 - 1));
    }
    
    public boolean isFullPila2(){
        return(tope1 == (p.length / 2 ));
    }
    
    public int sizePila1(){
        return(tope1 + 1);
    }
    
    public int sizePila2(){
        return(p.length - tope2);
    }
    
    public String toStringPila1() {
        StringBuilder sb = new StringBuilder("|");
        
        for (int i=0; i<this.sizePila1(); i++) {
            sb.append(" ").append(p[i]).append(" ");
        }
        
        sb.append("|\n");
        return sb.toString();
    }
    
    public String toStringPila2() {
        StringBuilder sb = new StringBuilder("|");
        
        for (int i = tope2; i< p.length; i++) {
            sb.append(" ").append(p[i]).append(" ");
        }
        
        sb.append("|\n");
        return sb.toString();
    }
}
