package com.javadsa.second;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();


        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
        System.out.println(Math.max(a,c));
    }
}
