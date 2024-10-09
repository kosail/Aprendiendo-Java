package com.korealm.Practica3U2;

import java.util.Arrays;
import java.util.Objects;

public class PilaLibros {
    private Libro[] stack;
    private int stackPointer = -1;
    
    public PilaLibros() {
        stack = new Libro[5];
    }
    
    public PilaLibros(int n) {
        stack = new Libro[n];
    }
    
    public Libro[] getStack() {
        return stack;
    }
    
    public int getPointer() {
        return stackPointer;
    }
    
    public void setStack(Libro[] stack) {
        this.stack = stack;
    }
    
    public void setPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }
    
    public void push(Libro value) {
        if (!isFull()) {
            stackPointer++;
            stack[stackPointer] = value;
        }
    }
    
    public Libro pop() {
        Libro removed = null;
        
        if ( !isEmpty() ) {
            removed = stack[stackPointer];
            stack[stackPointer] = null;
            
            stackPointer--;
        }
        
        return removed;
    }
    
    public Libro peek() {
        return (stackPointer != -1) ? stack[stackPointer] : null;
    }
    
    public void raiseBooksPrices(float raise) {
        if (stackPointer < 0) {
            return;
        }
        
        for (int i = stackPointer; i >= 0; i--) {
            stack[i].setPrecio(stack[i].getPrecio() * raise);
        }
    }
    
    public String clearStack() {
        if (this.isEmpty()) return null;
        
        StringBuilder sb = new StringBuilder();
        for (int i = stackPointer; i >= 0; i--) {
            sb.append(String.format("%s\n", stack[i].getTitulo()));
        }
        
        this.setStack(new Libro[stack.length]);
        this.setPointer(-1);
        
        return sb.toString();
    }
    
    public float getTotalPrice() {
        return (float) Arrays.stream(stack).filter(Objects::nonNull).mapToDouble(Libro::getPrecio).sum();
    }
    
    public boolean isEmpty() {
        return (stackPointer == -1);
    }
    
    public boolean isFull() {
        return (stackPointer == stack.length - 1);
    }
    
    public int size() {
        return stackPointer + 1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = stackPointer; i >= 0; i--) {
            sb.append(stack[i]).append("\n");
        }
        
        return sb.toString();
    }
}