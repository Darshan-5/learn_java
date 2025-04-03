package com.javadsa.Assignments.Day2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

        while (count<m){
            int  t = b;
            b = a+ b;
            a = t;
            count++;
        }
        System.out.println(count);
    }
}
