package org.constructors.parameterized;

public class Rectangle {
    int length;

    int breadth;

    //constructor to initialize length and breadth of rectangle
    Rectangle(int l, int b) {

        length = l;
        breadth = b;

    }

    //method to calculate area of rectangle
    int area() {

        return (length * breadth);

    }

    public static void main(String args[]) {

        Rectangle firstRect = new Rectangle(5, 5);

        Rectangle secondRect = new Rectangle(10, 20);

        System.out.println("Area of first rectangle=" + firstRect.area());

        System.out.println("Area of second rectangle=" + secondRect.area());

    }
}
