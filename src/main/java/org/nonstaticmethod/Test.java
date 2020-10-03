package org.nonstaticmethod;

public class Test {

    void m1() {
        System.out.println("I m in non-static block 1");
    }

    void m2() {
        System.out.println("I m in non-static block 2");
        m1(); //calling m1 from m2
    }

    public static void main(String args[]) {
        Test var = new Test(); //object of test
        var.m1(); //calling m1 from object var
        var.m2();
    }
}
