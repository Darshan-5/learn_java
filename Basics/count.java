package com.javadsa.second.second2;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int f = inp.nextInt();
        int count = 0;

        while(n>0) {
            int rem = n % 10;
            if (rem == f) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}

