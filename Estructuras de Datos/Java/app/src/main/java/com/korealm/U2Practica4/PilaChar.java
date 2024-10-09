package com.korealm.U2Practica4;

public class PilaChar {
    private char[] stack;
    private int stackPointer = -1;
    private static final char NULL = '\0';
    
    public PilaChar() {
        stack = new char[5];
    }
    
    public PilaChar(int n) {
        stack = new char[n];
    }
    
    public char[] getStack() {
        return stack;
    }
    
    public int getPointer() {
        return stackPointer;
    }
    
    public void setStack(char[] stack) {
        this.stack = stack;
    }
    
    public void setPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }
    
    public void push(char value) {
        if (!isFull()) {
            stackPointer++;
            stack[stackPointer] = value;
        }
    }
    
    public char pop() {
        char removed = NULL;
        
        if ( !isEmpty() ) {
            removed = stack[stackPointer];
            stack[stackPointer] = NULL;
            
            stackPointer--;
        }
        
        return removed;
    }
    
    public char peek() {
        return (stackPointer != -1) ? stack[stackPointer] : NULL;
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