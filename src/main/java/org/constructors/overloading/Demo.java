package org.constructors.overloading;

public class Demo {

    int value1;
    int value2;

    //no arguments passed
    Demo() {
        value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st Constructor");

    }

    //one argument passed
    Demo(int a) {
        value1 = a;
        System.out.println("Inside 2nd Constructor");

    }

    //two arguments passed
    Demo(int a, int b) {
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");

    }

    public void display() {
        System.out.println("Value1=" + value1);
        System.out.println("Value2=" + value2);
    }

    public static void main(String args[]) {
        Demo d1 = new Demo();
        d1.display();
        Demo d2 = new Demo(50);
        d2.display();
        Demo d3 = new Demo(50, 100);
        d3.display();
    }
}


