package com.javadsa.second;

public class cond {
    public static void main(String[] args) {
        int sal = 25000;
        if (sal > 10000) {
            sal = sal + 2000;
        }
        else{
            sal = sal + 1000;
        }
        System.out.println(sal);
    }
}