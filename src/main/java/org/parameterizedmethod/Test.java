package org.parameterizedmethod;

public class Test {

    //static method with variable passed in parameter
    public static int sum(int x, int y) {
        return x + y;
    }

    //main method
    public static void main(String[] args) {
        System.out.println(sum(10, 20));

    }
}
