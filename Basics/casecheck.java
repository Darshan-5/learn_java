package com.javadsa.second;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char ch = a.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Numbers");
        } else {
            System.out.println("Uppercase");
        }

    }
}
