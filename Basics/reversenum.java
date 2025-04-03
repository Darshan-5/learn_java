package com.javadsa.second.second2;

import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ans = 0;

        while(n>0){
            int rem = n%10;
            n /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
