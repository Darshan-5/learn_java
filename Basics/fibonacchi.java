package com.javadsa.second;

import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = in.nextInt();
        int count = 2;
        while(count<=n){
            int t = b;
            b += a;
            a = t;
            count++;
            System.out.println(b);
        }

    }
}
