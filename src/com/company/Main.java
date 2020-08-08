package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0123;     // OCTAL  (1 * 8^2) + (2 * 8^1) + (3 * 8^0) = 83
        int b = 00123;    // OCTAL  (0 * 8^3) + (1 * 8^2) + (2 * 8^1) + (3 * 8^0) = 83
        int c = 000123;   // OCTAL  (0 * 8^4) + (0 * 8^3) + (1 * 8^2) + (2 * 8^1) + (3 * 8^0) = 83 
        int d = 0x123;    // HEXADECIMAL  (1 * 16^2) + (2 * 16^1) + (3 * 16^0) = 291
        int e = 0x0123;   // HEXADECIMAL  (0 * 16^3) + (1 * 16^2) + (2 * 16^1) + (3 * 16^0) = 291
        int f = 0x00123;  // HEXADECIMAL  (0 * 16^4) + (0 * 16^3) + (1 * 16^2) + (2 * 16^1) + (3 * 16^0) = 291
        int g = 123;      // DECIMAL (1 * 10^2) + (2 * 10^1) + (3 * 10^0) = 123
        System.out.println(a + " " + b + " " + c);
        System.out.println(d + " " + e + " " + f);
        System.out.println(g);
    }
}
