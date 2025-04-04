package com.javadsa.Functions;

import java.util.Scanner;

public class sum {

    static int sum() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }

    }
