package com.javadsa.Assignments;

import java.util.Scanner;

public class ptr {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter the Principle Amount : ");
        float p = i.nextFloat();
        System.out.println("Enter the Time : ");
        int t = i.nextInt();
        System.out.println("Enter the Rate of Interest : ");
        float r = i.nextFloat();

        System.out.println("The Interest amount is : "+(p*t*r)/100);

    }
}
