package org.finalvariable;

public class Test {

    final static int x;

    static {
        x = 10; //initializing static final variable
    }

    public static void main(String[] args) {

        final int y;
        y = 100;//can be initialized only once

        System.out.println("hello" + y);
        System.out.println(x);
    }
}
