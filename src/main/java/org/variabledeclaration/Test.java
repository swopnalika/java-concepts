package org.variabledeclaration;


public class Test {
    static int x;
    public String y;

    static {
        System.out.println("Inside static block");
        System.out.println("value of x=" + x);
        // System.out.println("value of y="+y);
    }

    {
        System.out.println("Inside non static block");
        System.out.println("value of x=" + x);
        System.out.println("value of y=" + y);
    }

    public static void m1() {
        System.out.println("Inside static method");
        System.out.println("value of x=" + x);
        // System.out.println("value of y="+y);
    }

    public void m2() {
        System.out.println("Inside non static method");
        System.out.println("value of x=" + x);
        System.out.println("value of y=" + y);
    }

    public static void main(String[] args) {
        Test var = new Test();
        m1();
        var.m2();
        System.out.println("Inside main method");
        System.out.println("value of x=" + x);
        // System.out.println("value of y="+y);

    }
}
