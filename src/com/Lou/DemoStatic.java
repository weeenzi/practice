package com.Lou;

public class DemoStatic {
    static{
        System.out.println("method看好了 static是这么用的!");
    }
    int id;
    String name;
    static String guoji="中国";

    public  void DemoStatic(int id,String name){
        this.id = id;
        this.name = name;

    }
}
