package com.Lou;

import java.util.Scanner;

public class ShuRu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字已算出他们的平均值");

        double sum = 0;
        double mix = 0;
        while(sc.hasNextDouble()){
            System.out.println("请输入数字或者end结束");
          double   a = sc.nextDouble();
            sum += 1;
            mix += a;
        }
        System.out.println("这些数字的平均数是" + mix/sum);


    }
}
