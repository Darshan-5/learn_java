package com.javadsa.second.second2;

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true){
            System.out.print("Enter the operator: ");
            char op = inp.next().trim().charAt(0);

            System.out.println("Enter the Numbers: ");
            int n1 = inp.nextInt();
            int n2 = inp.nextInt();

            System.out.println("The Answer is : ");
            if(op == '+' ){
                System.out.println(n1+n2);
            } else if (op == '-') {
                System.out.println(n1-n2);
            } else if (op == '*') {
                System.out.println(n1*n2);
            } else if (op == '/' && n2 != 0) {
                System.out.println(n1/n2);
            } else if (op == '%') {
                System.out.println(n1%n2);
            } else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
        }
    }
}
