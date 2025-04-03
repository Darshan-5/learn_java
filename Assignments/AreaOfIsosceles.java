package com.javadsa.Assignments.Day2;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Length of triangles : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a==b && c!=a) {
            System.out.println("The area Of isosceles Triangle is : " + a * b * c);
        }
        if(a==b && c==a) {
            System.out.println("The area Of Equilateral Triangle is : " + a * b * c);
        }
        if(a!=b && c!=a) {
            System.out.println("The area Of Scalene Triangle is : " + a * b * c);
        }
    }
}
