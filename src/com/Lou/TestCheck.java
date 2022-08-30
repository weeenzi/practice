package com.Lou;

import java.util.Scanner;

public class TestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press a integer");
        int a = sc.nextInt();
        check(a);
    }
    public static void check(int a){
        if(a%2==0){System.out.println(a+"shi ou shu");}
        else System.out.println(a+"shi ji shu");

    }
}
