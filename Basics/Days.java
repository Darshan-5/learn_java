package com.javadsa.third;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();

        switch (a){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednsday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }
    }
}
