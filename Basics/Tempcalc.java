package com.javadsa;

import java.util.Scanner;

public class Tempcalc {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        float cel = temp.nextFloat();
        float far = (cel * 9/5)+32;
        System.out.println("The Faranhite is : " +far);
    }
}
