package Test01;

import java.util.Scanner;

public class TestAdd {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("press 2 integer ");
        int firstInt = sc.nextInt();
        int lastInt = sc.nextInt();
        System.out.println(firstInt+" + "+lastInt+" = "+add(firstInt,lastInt));
    }
    public static int add(int firstInt,int lastInt){
        return firstInt+lastInt;
    }
}
