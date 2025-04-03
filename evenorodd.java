package com.javadsa.Assignments;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int b = a.nextInt();

        if(b%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
