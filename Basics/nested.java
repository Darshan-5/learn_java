package com.javadsa.third;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String dept = in.next();

        switch (empid) {
            case 1:
                System.out.println("Darshan");
                break;
            case 2:
                System.out.println("Chandan");
                break;
            case 3:
                switch (dept){
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "Management":
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("No Deparment");
                }
                break;
            default:
                System.out.println("NO name");
        }
    }
}