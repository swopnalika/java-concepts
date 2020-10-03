package org.blocks;

public class Test {
    static int a;
    static int b;
    static int c;
    //static block1
    static {

        System.out.println("Im in static block 1");
        a = 10;
        b = 20;
        c = a+b;

    }
    //static block2
    static
    {
        System.out.println("Im in static block 2");

    }
    public static void main(String args[]) {
        System.out.println("I m in main method");

        Test obj=new Test();
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("sum of two numbers = " + c);
    }
}
