package org.constructors.thiskeyword;

public class SwapNum {
    int a;
    int b;

    SwapNum(int a, int b) {
        this.a = a - b;
        this.b = this.a + b;
        this.a = this.b - this.a;
    }

    public static void main(String[] args) {
        {

            SwapNum o = new SwapNum(10, 20);
            System.out.println("Before swapping: a=10 b=20");
            System.out.println("After swapping: a=" + o.a + "" + "b=" + o.b);
            SwapNum obj = new SwapNum(100, 50);
            System.out.println("Before swapping: a=100 b=50");
            System.out.println("After swapping: a=" + obj.a + "" + "b=" + obj.b);
        }
    }
}
