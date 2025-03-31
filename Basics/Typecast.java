package com.javadsa;

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        // automatic
        float b = a.nextInt();
        System.out.println(b);
        float c  = a.nextFloat();

        //type cast explicitely
        int d = (int) c;
        int x = (int)(5415.25f);
        System.out.println(d);

        byte f = (byte)(257); // basically 257%256
        System.out.println(f);

        int r = 'A';
        System.out.println(r);

        String h = "ದಸರ್ಷಣ";
        System.out.println(h);
    }
}
