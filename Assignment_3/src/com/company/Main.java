package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a = 3;
        double b = 4;
        double m = 0;
        String r = "The minimum of numbers %f and %f is %f.";
        m = Math.min(a, b);
        System.out.printf(r, a, b, m);
    }
}
