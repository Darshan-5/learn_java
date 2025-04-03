package com.javadsa.third;

import java.util.Scanner;

public class enhanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        switch (a){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("WeekEnd");
        }
    }
}
