package com.javadsa.Assignments;

import java.util.Scanner;

public class largest2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int a = i.nextInt();
        int b = i.nextInt();

        int max = a;
        if(b > a){
            max = b;
        } else {
            max = a;
        }
        System.out.println("MAX : "+ max);
    }
}
