package com.Lou;

public class TestChange {
    public static void main(String[] args) {
        int a =5;
        int b =6;
        int c ;
        System.out.println("before change" +a+b);
        c=a;
        a=b;
        b=c;
        System.out.println("after change" +a+b);

    }

}
