package com.javadsa.third;

import java.util.Scanner;

public class swith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        switch (a){
            case "Mango":
                System.out.println("Sweet");
                break;
            case "Orange":
                System.out.println("Sour");
                break;
            default:
                System.out.println("Tasty");
        }

    }
}
