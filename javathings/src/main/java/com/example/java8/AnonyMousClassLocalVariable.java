package com.example.java8;

public class AnonyMousClassLocalVariable {
    public static void main(String[] args) {
        int localvar=10;

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int val = localvar + 100;
                System.out.println(val);
            }
        });
        //localvar=110;
        t.start();
    }
}
