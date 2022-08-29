package com.javase.test;

public class BirdTest {
    public static void main(String[] args) {
        Bird a = new Bird();
        a.name="鸟";
        a.move();

        Ken b = new Ken();
        b.name = "母鸡";
        b.move();

        YIngWu c =new YIngWu();
        c.name = "鹦鹉";
        c.move();
    }
}
