package org.staticmethod;

public class Test {
    //find summation of series 1^2+2^2+3^2.....n^2


    static int n = 100;

    static void m1() {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + (i * i);
        }
        System.out.println(" sum=" + sum);
    }

    static void m2() {
        System.out.println("I m in static block 2");
        m1();  // calling m1 from m2
    }

    public static void main(String args[]) {
        Test.m1(); //calling m1 without creating object
        m2();
    }
}
