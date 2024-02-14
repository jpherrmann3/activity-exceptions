package com.example;

public class DivideByZeroException extends RuntimeException{

    public DivideByZeroException() {
    }

    public DivideByZeroException(String var1) {
       super(var1);
    }

    public DivideByZeroException(String var1, Throwable var2) {
       super(var1, var2);
    }

    public DivideByZeroException(Throwable var1) {
       super(var1);
    }

    protected DivideByZeroException(String var1, Throwable var2, boolean var3, boolean var4) {
       super(var1, var2, var3, var4);
    }
}
